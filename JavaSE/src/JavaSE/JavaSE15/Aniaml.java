package JavaSE.JavaSE15;

public class Aniaml {
    public String name;
    public void eat(){
        System.out.println(this.name+"吃东西");
    }
    public Aniaml() {
        this.name = "动物";
    }
    public Aniaml(String name) {
        this.name = name;
    }
}
