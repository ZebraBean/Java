package JavaSE.JavaSE17;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/25
 * Time: 15:28
 * Description: No Description
 */
public class 反射修改字符串 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "abcdef";
        System.out.println(str);
        //1.获取class对象
        Class cl = String.class;
        //2.通过cl获取value字段，这个 value 和 String 源码中的 value 是匹配的.
        Field field = cl.getDeclaredField("value");
        // 3.将这个字段的访问属性设为 true
        field.setAccessible(true);
        // 4.把 str 中的 value 属性获取到.
        char[] value = (char[])field.get(str);
        // 5.修改 value 的值
        value[0] = 'g';
        System.out.println(str);
    }
}
