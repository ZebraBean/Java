package JavaSE.JavaSE09;
class Calculator{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
    public int sub(){
        return num1-num2;
    }
    public int mul(){
        return num1*num2;
    }
    public int div(){
        return num1/num2;
    }
}


public class 计算器 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        Calculator cal = new Calculator(num1,num2);
        System.out.println("num1+num2="+cal.add());
        System.out.println("num1-num2="+cal.sub());
        System.out.println("num1*num2="+cal.mul());
        System.out.println("num1/num2="+cal.div());

    }

}
