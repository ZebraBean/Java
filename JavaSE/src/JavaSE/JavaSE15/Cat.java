package JavaSE.JavaSE15;

public class Cat extends Aniaml{
    public Cat() {
        this.name = "猫";
    }
    public Cat(String name) {
        super(name);
    }

    public void eat(){
        System.out.println(this.name+"吃猫粮");
    }
}
