package Zebra.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/9
 * Time: 17:22
 * Description: No Description
 */
public class JSONUtilTest {

    //单元测试：junit框架使用方法上@Test注解，保证方法为public void
    @Test
    public void testSerialize(){
        //测试序列化操作：使用map模拟复杂
        Map map = new HashMap();
        map.put("name", "java40班");
        map.put("students", new int[]{1, 2});
        String json = JSONUtil.serialize(map);
        System.out.println(json);
        Assert.assertNotNull(json); //如果json不为空，单元测试通过
    }

    @Test
    public void testDeserialize(){
        //类加载器加载某个资源，返回输入流
        InputStream is = JSONUtilTest.class.getClassLoader()
                .getResourceAsStream("login.json");
        Map map = JSONUtil.deserialize(is, Map.class);
        System.out.println(map);
        Assert.assertNotNull(map);
    }
}