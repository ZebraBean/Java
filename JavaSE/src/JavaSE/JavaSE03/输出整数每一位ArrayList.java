package JavaSE.JavaSE03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 输出整数每一位ArrayList {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        while(data != 0){
            integers.add(data % 10);
            data /= 10;
        }
        Collections.reverse(integers);
        System.out.println("从最高位到最低位依次输出：");
        for (Integer integer : integers) {
            System.out.print(integer+",");
        }

    }
}
