package JavaSE.JavaSE04;
//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class 奇数放到偶数前面 {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5,6,7};
        turn(a);
        for (int i : a) {
            System.out.println(i);

        }
    }
    public static void turn(int[] a){
        int i = 0;
        int j = a.length-1;   //使用前后两个哨兵，一个从前往后找，一个从后往前，前面遇到偶数，后面遇到奇数的时候，停下来进行交换
        while (i != j){
            while(i < j && a[i] % 2 != 0){
                i++;
            }
            while(i < j && a[j] % 2 == 0){
                j--;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
//            if(a[i] % 2 == 0){
//                if (a[j] % 2 != 0){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//                else {
//                    j--;
//                }
//            }else {
//                i++;
//            }
        }
    }
}
