package Zebra.study.controller;

import lombok.Getter;
import Zebra.study.model.User;
import Zebra.study.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller//注册一个id为类名首字母小写，的bean对象
@Getter
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private User u1;

    @Autowired
    @Qualifier("u2")
    private User ukkkk;

    //注册一个返回值User对象到容器中，id=方法名
    @Bean
    public User u1(){
        User user = new User();
        user.setUsername("我是u1");
        user.setPassword("u1的u1");
        return user;
    }

    @Bean
    public User u2(){
        User user = new User();
        user.setUsername("我是u2");
        user.setPassword("u2的u2");
        return user;
    }

    @Bean
    public User u3(User u2){
        System.out.println(u2);
        User user = new User();
        user.setUsername("我是u3");
        user.setPassword("u3的u3");
        return user;
    }
}
