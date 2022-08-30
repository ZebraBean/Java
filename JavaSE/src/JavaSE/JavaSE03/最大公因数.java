package JavaSE.JavaSE03;

import java.util.Scanner;
//求两个正整数的最小公倍数
public class 最大公因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int d1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int d2 = sc.nextInt();
        int mul = d1 * d2;
        while (d2 != 0){    //辗转相除法：不管大小a%b得到余数，然后a=b;b=余数；就这样循环，当b也就是除数为0，循环结束，此时被除数a就是最大公约数
            int res = d1 % d2;
            d1 = d2;
            d2 = res;
        }
        System.out.println("它们的最小公倍数是"+mul/d1); //最小公倍数是d1*d2/最大公因数
//        for (int i = Math.max(d1,d2);; i++) {
//            if(i % d1 == 0 && i % d2 == 0){
//                System.out.println("它们的最小公倍数是"+i);
//                break;
//            }
//        }
    }
}
