package JavaSE.JavaSE03;

import java.util.Scanner;

public class JavaSE03求阶乘的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0,i = 1;
        int temp;
        while (i <= num){
            temp = 1;
            int  j = 1;
            while ( j <= i ){
                temp = temp * j;
                j++;
            }
            ans = ans + temp;
            i++;
        }
        System.out.println("请输入n的值");
        System.out.println("1!+2！+3！+。。。+n!="+ans);
    }

}