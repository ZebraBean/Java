package JavaSE.JavaSE03;

import java.util.Scanner;

//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输入，最多输入三次。三次均错，则提示退出程序
public class 输入密码三次机会 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        int count = 3;
        String password = "123";
        while(count != 0){
            String pass = sc.next();
            if(pass.equals(password)){
                System.out.println("密码正确");
                break;
            }else {
                count--;
                System.out.println("密码错误,你还有"+count+"次机会");
            }

        }
    }
}
