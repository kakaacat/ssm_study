import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Author : kaka
 * @Date: 2021-10-10 14:28
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口
        UserService service = context.getBean("userService", UserService.class);
        service.add();
    }
}
