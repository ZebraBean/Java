package JavaSE.JavaSE18;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/28
 * Time: 16:03
 * Description: No Description
 */
public class 字符串逆置 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str);
        System.out.println(reverse(str,3,5));
    }
    public static String reverse(String str, int begin , int end){
        char[] chars = str.toCharArray();
        int i = begin;
        int j = end;
        char temp;
        while(i < j){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
