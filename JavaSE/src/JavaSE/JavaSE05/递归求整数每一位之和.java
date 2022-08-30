package JavaSE.JavaSE05;

import java.util.Scanner;

public class 递归求整数每一位之和 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("该整数每一位数的和为"+sum(data));

    }
    public static int sum(int data){
        if(data == 0){
            return 0;
        }
        return data%10+sum(data/10);
    }
}
