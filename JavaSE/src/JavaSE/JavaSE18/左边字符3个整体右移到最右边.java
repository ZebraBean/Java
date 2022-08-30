package JavaSE.JavaSE18;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/29
 * Time: 12:17
 * Description: No Description
 */
public class 左边字符3个整体右移到最右边 {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str);
        System.out.println(move(str,3));
    }
//    public static String move(String str, int k){
//        String ans = str.substring(k);
//        ans += str.substring(0,k);
//        return ans;
//    }
    public static String move(String str,int k){  //用三次字符串逆置
        String str1 = reverse(str,0,k-1); //先将0到k-1逆置
        String str2 = reverse(str1,k,str1.length()-1);  //再将k到length-1逆置
        String str3 = reverse(str2,0,str2.length()-1);  //最后将整个逆置
        return str3;
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
