package JavaSE.JavaSE08;

import java.util.Arrays;

public class 数组逆序 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

    }
    public static void reverse(int[] a){
        int i = 0;
        int j = a.length-1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
