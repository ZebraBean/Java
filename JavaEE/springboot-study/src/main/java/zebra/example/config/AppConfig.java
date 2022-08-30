package zebra.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zebra.example.config.web.LoginInterceptor;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/19
 * Time: 20:43
 * Description: No Description
 */
@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //Controller路径，统一添加请求的路径前缀，第二个参数，c是Controller类，返回boolean表示是否添加前缀
        //所有Controller请求路径，都要带/api的前缀
        configurer.addPathPrefix("api", c->true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
        .addPathPatterns("/api/**")//添加路径拦截规则，**表示下级多级目录的任意字符匹配
        .excludePathPatterns("/api/para/login");//排除登录路径
    }
}
