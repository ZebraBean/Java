package JavaSE.JavaSE03;

import java.util.*;
//求两个正整数的最大公约数
public class 最小公倍数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int d1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int d2 = sc.nextInt();
//        int flag = 0;
//        for (int i = Math.min(d1,d2); i >= 2 ; i--) {
//            if (d1 % i == 0 && d2 % i == 0){
//                flag = i;
//                break;
//            }
//        }
//        if (flag == 0){
//            System.out.println("它们没有最大公约数");
//        }else{
//            System.out.println("它们的最大公约数是"+flag);
//        }
        while (d2 != 0){    //辗转相除法：不管大小a%b得到余数，然后a=b;b=余数；就这样循环，当b也就是除数为0，循环结束，此时被除数a就是最大公约数
            int res = d1 % d2;
            d1 = d2;
            d2 = res;
        }
            System.out.println("它们的最大公约数是"+d1);    //0和一个数的最大公约数就是那个数本身
    }
}
