package JavaSE.JavaSE03;
//求出0～999之间的所有“水仙花数”并输出
public class 水仙花数 {
    public static void main(String[] args) {
        System.out.println("1000以内的水仙花数为：");
        for (int i = 100; i < 1000 ; i++) {
            judge(i);
        }
////            int num = i;
////            int w1 = num % 10;
////            num = num / 10;
////            int w2 = num % 10;
////            int w3 = num / 10;
////            if((Math.pow(w1,3)+Math.pow(w2,3)+Math.pow(w3,3)) == i){
////                System.out.println(i);
////            }
//        }
    }
    static void judge(int data){    //（判断一个数是不是水仙花类似数数，不一定只有三位）
        int count = 0;
        int temp = data;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        temp = data;
        int sum = 0;
        while(temp != 0){
            sum += Math.pow(temp % 10 , count); //这里Math.pow返回的是double类型的数据，但是sum是int，
                                                // 按理说会出问题，但是+=这个符合运算符会自动进行强制类型转换
            temp /= 10;
        }
        if (sum == data){
            System.out.println(data+"是水仙花数");
        }
    }
}
