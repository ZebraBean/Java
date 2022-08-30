package zebra.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zebra.example.Exception.AppException;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/21
 * Time: 14:01
 * Description: No Description
 */

@RestController
@RequestMapping("/ex")
public class ExceptionTest {

    @GetMapping("/1")
    public Object ex1(){
        int i = 1;
        int x = i/0;
        return new Object();
    }

    @GetMapping("/2")
    public Object ex2(){
        throw new AppException("ex2", "数据库出错了");
    }
}
