import kaka.config.UserConfig;
import kaka.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : kaka
 * @Date: 2021-10-09 16:57
 */
public class MyTest {
    @Test
    public void test1(){
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
}
