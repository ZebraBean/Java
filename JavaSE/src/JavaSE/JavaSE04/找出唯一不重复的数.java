package JavaSE.JavaSE04;
//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class 找出唯一不重复的数 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,5,2,1};
        System.out.println("该不重复的数字为"+find(a));
    }
    public static int find(int[] a){
        int res = a[0];
        for (int i = 1; i < a.length ; i++) {
            res ^= a[i];
        }
        return res;
    }
}
