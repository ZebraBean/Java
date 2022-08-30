package JavaSE.JavaSE06;

import java.util.Scanner;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
public class 青蛙跳台阶问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tj = sc.nextInt();
        System.out.println(jumpFloor(tj));
    }

    public static int jumpFloor(int n) {
        //思路1.对于n阶台阶，它第一次只能跳1阶或者2阶，若第一次跳1阶，则有f(n-1)种跳法，若第一次跳2阶，则有f(n-2)种跳法
        //思路2.对于第n阶台阶，只能从第n-1阶和第n-2阶台阶上面跳上来，所以f(n)=f(n-1)+f(n-2)
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 3;
        while (n > 2){
            n--;
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
