package JavaSE.JavaSE15;

public class Bird extends Aniaml {
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name+"可以飞");
    }
}
