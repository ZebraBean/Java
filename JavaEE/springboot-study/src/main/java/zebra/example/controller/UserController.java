package zebra.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "redirect:/index.html";
        //redirect是重定向，forward是转发
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody  //加上这个注解以后，返回的就是请求体的内容了，而不是服务路径，最后会把/login显示出来
    public String test1() {
        return "/login";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Object test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        return map;
    }

}
