package JavaSE.JavaSE05;

import java.util.Scanner;
//求1+2+3+4+5+6+7+8+9+...+n
public class 递归求和 {
    public static void main(String[] args54) {
        System.out.println("请输入n的值");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("前n项和为："+sum(n));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return sum(n-1)+n;
    }
}
