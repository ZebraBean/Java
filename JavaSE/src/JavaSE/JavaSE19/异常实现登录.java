package JavaSE.JavaSE19;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/29
 * Time: 16:55
 * Description: No Description
 */
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class 异常实现登录 {
    private static String userName = "admin";
    private static String password = "123456";
    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError,
            PasswordError {
        if (!异常实现登录.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!异常实现登录.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
