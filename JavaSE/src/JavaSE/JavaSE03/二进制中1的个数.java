package JavaSE.JavaSE03;
//写一个函数返回参数二进制中 1 的个数
import java.util.Scanner;

public class 二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("该数的二进制里面1的个数为"+fun(data));
    }
//    static int fun(int num){  //常规模2取余法
//        int count = 0;
//        while(num != 0){
//            if(num % 2 == 1){
//                count++;
//            }
//            num = num / 2;
//        }
//        return  count;
//    }
    static int fun(int num){  //常规不断&n-1法，&了几次就有几个1
        int count = 0;
        while (num != 0){
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}
