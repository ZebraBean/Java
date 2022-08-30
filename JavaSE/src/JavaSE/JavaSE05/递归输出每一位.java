package JavaSE.JavaSE05;
//输出一个整数的每一位数（递归实现）
import java.util.Scanner;

public class 递归输出每一位 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        fun(data);

    }
    public static void fun(int data){
        if(data == 0){
            return;
        }
        fun(data/10);
        System.out.print(data%10+" ");
    }
}
