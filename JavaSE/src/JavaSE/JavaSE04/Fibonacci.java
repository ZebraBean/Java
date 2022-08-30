package JavaSE.JavaSE04;

import java.util.Scanner;
//求第n项斐波那契数列
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("请输入n的值");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("第"+n+"项斐波那契数列的和为"+fib(n));
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return  1;
        }
        else {
            //return f(n-1) + f(n-2);//最好不要写这种递归的fib
            int f1 = 1;
            int f2 = 1;
            int f3 = 0;
            while(n > 2){
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                n--;
            }
            return f3;
        }
    }
}
