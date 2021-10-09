import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import kaka.pojo.User;

/**
 * @Author : kaka
 * @Date: 2021-10-09 16:24
 */
public class MyTest {
    @Test
    public void test1(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);

        System.out.println(user.getName());
    }
}
