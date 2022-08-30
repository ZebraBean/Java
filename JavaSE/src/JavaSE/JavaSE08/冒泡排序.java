package JavaSE.JavaSE08;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a = {2,5,6,1,4,3};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] a){
        boolean flag;
        for (int i = 0; i < a.length-1; i++) {  //从前往后，每一轮循环把最大的一个数放到最后面去
            flag = false;  //用来优化冒泡排序，因为如果一轮循环以后已经有序，那么之后的循环都没有必要的
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;  //表示发生了比较，flag置为true
                }
            }
            if(flag == false){  //如果该轮i循环没有发生比较，那表明数组已经有序，break退出循环
                break;
            }
        }
    }
}
