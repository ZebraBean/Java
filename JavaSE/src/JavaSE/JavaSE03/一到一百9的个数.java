package JavaSE.JavaSE03;

public class 一到一百9的个数 {
        public static void main(String[] args) {
            int ans = 0;
            for (int i = 1; i <= 100; i++) {
                ans=ans+f(i);
            }
            System.out.println("1-100有"+ans+"个9");
        }


        static int f(int i){
            int count = 0;
            if(i % 10 == 9){
                count++;
            }
            if(i / 10 == 9){
                count++;
            }
            return  count;
        }
    }

