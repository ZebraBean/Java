package zebra.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import zebra.example.Exception.AppException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/21
 * Time: 14:13
 * Description: No Description
 */
//在SpringBoot中使用，会扫描启动类所在包下所有@Controller类
@ControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public Object handle(AppException e){
        log.debug("自定义异常",e);
        Map<String, Object> map = new HashMap<>();
        map.put("ok", false);
        map.put("code", e.getCode());
        map.put("msg", e.getMessage());
        return map;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle(Exception e){
        log.error("非自定义异常",e);
        Map<String, Object> map = new HashMap<>();
        map.put("ok", false);
        map.put("code", "ERR000");
        map.put("msg", "未知错误，请联系管理员");
        return map;
    }
}
