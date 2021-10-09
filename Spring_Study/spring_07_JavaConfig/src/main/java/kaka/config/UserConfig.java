package kaka.config;

import kaka.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author : kaka
 * @Date: 2021-10-09 16:54
 */

//这个也会Spring容器托管，注册到容器中,因为他本来就是一个@Component
//@Configuration代表这是一个配置类，就和我们之前看的beans.xmL一样

@Configuration
@ComponentScan("kaka")
@Import(UserConfig2.class) //引入
public class UserConfig {


    @Bean
    public User user(){
        return new User();
    }
}
