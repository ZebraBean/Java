package JavaSE.JavaSE03;

public class 打印闰年 {
    public static void main(String[] args) {
        System.out.println("1000-2000中的闰年:");
        for (int i = 1000; i <=2000 ; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.println(i+"年");
            }
        }
    }
}
