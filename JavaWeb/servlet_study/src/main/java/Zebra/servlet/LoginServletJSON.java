package Zebra.servlet;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/2
 * Time: 17:14
 * Description: No Description
 */

//注解的使用：小括号包裹多个属性，属性名=属性值，多个之间逗号间隔，属性名为value时可以缺省
//Servlet定义服务：注意服务路径必须是/开始，否则tomcat启动就会报错
@WebServlet("/loginJSON")
public class LoginServletJSON extends HttpServlet {
    /**
     * 每次http请求映射到某个Servlet的资源路径，都会调用service生命周期方法
     * 如果请求方法没有重写，就调用父类的doXXX（对应请求方法），返回405
     * 如果重写，会将请求数据包装为一个Request请求对象，这时候虽然还没有响应，但是也
     * 包装了一个Response响应对象
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求，响应编码，及响应数据类型（为响应体设置Content-Type数据类型）
        req.setCharacterEncoding("UTF-8");//设置请求体编码
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        //解析数据
        //request.getParameter方法获取请求数据：url和请求体，数据格式为k1=v1&k2=v2
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        System.out.printf("=====================用户名（%s）密码（%s）%n", u, p);


        //返回响应数据
        PrintWriter pw = resp.getWriter();//response获取io输出流

        if(query(u,p)) {
            pw.println("{\"success\": true}");
        }else{
            pw.println("{\"success\": false}");
        }

        pw.flush();//有缓冲的io操作，需要刷新缓冲区，才会真正的发送数据
        pw.close();//io流操作完，一定要记住关闭资源
    }

    public static boolean query(String u,String p){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setURL("jdbc:mysql://localhost:3306/testdb?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8&useSSL=false");
            connection = ds.getConnection();
            String sql = "select username,password from users where username = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,u);
            preparedStatement.setString(2,p);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){  //判断结果集是否为空
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            //执行某个功能，如果出现异常，建议再次抛出异常，返回null是最土的情况。
            e.printStackTrace();
            throw new RuntimeException("查询信息出错",e);
        }  finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
