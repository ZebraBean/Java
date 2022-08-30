package zebra.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import zebra.example.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/para")
public class ParameterController {
    @RequestMapping("/query/{id}")
    public Object t1(@PathVariable Integer id) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Zebra"+id);
        map.put(2, "Pig");
        return map;
    }

    @PostMapping("/param1")
    public Object param1(@RequestParam String username, @RequestParam String password){
        Map<String, String> map = new HashMap<>();
        map.put("用户名", username);
        map.put("密码", password);
        return map;
    }

    @PostMapping("/param2")
    public Object param2(@RequestParam(required = false) Integer count){
        Map<String, Integer> map = new HashMap<>();
        map.put("count", count);
        return map;
    }

    @PostMapping("/param3")
    public Object param3(@RequestParam MultipartFile file) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("文件名", file.getName()+", "+file.getOriginalFilename());
        map.put("文件类型", file.getContentType());
        map.put("文件大小", file.getSize()/1024+"KB");
        map.put("文件内容（二进制转字符串）", new String(file.getBytes()));
        return map;
    }

    @PostMapping("/pojo1")
    public Object pojo1(String username, Integer count){
        Map<String, String> map = new HashMap<>();
        map.put("用户名", username);
        map.put("count", String.valueOf(count));
        return map;
    }

    @PostMapping("/pojo2")
    public Object pojo2(User user){
        Map<String, String> map = new HashMap<>();
        map.put("用户名", user.getUsername());
        map.put("密码", user.getPassword());
        return map;
    }

    @PostMapping("/pojo3")
    public Object pojo3(User user, MultipartFile file) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("用户名", user.getUsername());
        map.put("密码", user.getPassword());
        map.put("文件名", file.getName()+", "+file.getOriginalFilename());
        map.put("文件类型", file.getContentType());
        map.put("文件大小", file.getSize()/1024+"KB");
        map.put("文件内容（二进制转字符串）", new String(file.getBytes()));
        return map;
    }

    @PostMapping("/json")
    public Object json(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        map.put("用户名", user.getUsername());
        map.put("密码", user.getPassword());
        return map;
    }

    @GetMapping("/servlet")
    public void servlet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter pw = resp.getWriter();
        pw.println("接收到的请求为：用户名="+username+"，密码："+password);
        pw.flush();
        pw.close();
    }

    @GetMapping("/header")
    public String header(@RequestHeader("Accept-Encoding") String encoding,
                         @RequestHeader("User-Agent") String userAgent) {
        return String.format("<p>Accept-Encoding: %s</p><p>User-Agent: %s</p>",
                encoding, userAgent);
    }

    @GetMapping("/cookie")
    public String cookie(@CookieValue("JSESSIONID") String cookie) {
        return String.format("JSESSIONID: %s", cookie);
    }


    @RequestMapping("/login")
    public Object login(@RequestBody User user , HttpServletRequest req) {
        Map<String,Object> map = new HashMap<>();
        if ("Zebra".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            HttpSession session = req.getSession();
            //添加用户身份信息到session
            session.setAttribute("user", user);
            map.put("OK", true);
            map.put("msg", "登录成功");
        } else {
            map.put("OK", false);
            map.put("msg", "用户名密码错误");
        }
        return map;
    }
}
