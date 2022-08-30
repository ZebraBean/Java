package JavaSE;
import java.util.*;

public class JavaSE01转进制 {
    public static void main(String[] args) {
        //输入10进制，输出它的二进制和十六进制
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();    //输入10进制数
        {
            int d = data;
            ArrayList a = new ArrayList();
            while(d != 0)    //用除2取余法
            {
                a.add(d%2);
                d=d/2;
            }
            Collections.reverse(a);    //将数组逆置
            System.out.print(data+"的二进制为");
            for (Object o : a) {   //for each循环
                System.out.print(o);
            }
            System.out.println("");
            a.clear();
        }  //二进制

        {
            int d = data;
            ArrayList a = new ArrayList();
            while(d != 0)
            {
                if(d%16 < 10)
                    a.add(d%16);
                else    //如果余数大于10，将其转换成字母
                {
                    char[] temp = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
                    a.add(temp[d%16-10]);
                }
                d=d/16;
            }
            Collections.reverse(a);  //将数组逆置
            System.out.print(data+"的十六进制为");
            for (Object o : a) {
                System.out.println(o);
            }
            System.out.println("");
            a.clear();
        }  //十六进制

        System.out.println(Integer.toBinaryString(data));  // 将data转换成二进制输出
        System.out.println(Integer.toHexString(data));     // 将data转换成十六进制输出

    }
}
//10/2=5..0
//5/2=2..1
//2/2=1..0
//1/2=1..1