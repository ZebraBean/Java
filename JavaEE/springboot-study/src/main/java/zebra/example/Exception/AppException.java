package zebra.example.Exception;
import lombok.Getter;
import lombok.Setter;
/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/22
 * Time: 13:49
 * Description: No Description
 */

@Getter
@Setter
public class AppException extends RuntimeException {
    private String code;//错误码

    public AppException(String code, String message) {
        super(message);
        this.code = code;
    }

    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}