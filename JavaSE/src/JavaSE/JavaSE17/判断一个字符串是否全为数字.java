package JavaSE.JavaSE17;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/25
 * Time: 20:26
 * Description: No Description
 */
public class 判断一个字符串是否全为数字 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ab123";


        System.out.println(hasInteger(s1));
        System.out.println(hasInteger(s2));
    }
    public static boolean hasInteger(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                return true;
            }
        }
        return false;
    }
}

