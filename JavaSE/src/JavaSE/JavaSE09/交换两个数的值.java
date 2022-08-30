package JavaSE.JavaSE09;


class Num{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class 交换两个数的值 {
    public static void main(String[] args) {
        Num num1 = new Num();
        Num num2 = new Num();
        int a = 5;
        int b = 6;
        System.out.println("a="+a+",b="+b);
        num1.setNum(a);
        num2.setNum(b);
        turn(num1,num2);
        a = num1.getNum();
        b = num2.getNum();
        System.out.println("a="+a+",b="+b);

    }
    public static void turn(Num n1,Num n2){
        int temp = n1.getNum();
        n1.setNum(n2.getNum());
        n2.setNum(temp);
    }
}
