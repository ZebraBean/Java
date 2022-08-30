package zebra.example.config.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import zebra.example.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/21
 * Time: 10:23
 * Description: No Description
 */
public class LoginInterceptor implements HandlerInterceptor {
    //重写preHandle方法，表示请求路径最终匹配到某个Controller时，在调用控制器
    //方法前，先执行本拦截器的前置处理逻辑
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //注意这里的session要设置成传入false，表示如果没有session不能自己创建
        HttpSession session = request.getSession(false);
        //session不为空，表示已登录
        if(session != null){
            //如果session不为空,并且session里面的user对象不为空，返回true，允许继续执行Controller中的方法
            User user = (User) session.getAttribute("user");
            if (user != null) {
                return true;
            }
        }
        //响应状态码设置为401
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        //返回false，不再执行Controller中的方法，直接响应一个空的响应体
        return false;
    }
}
