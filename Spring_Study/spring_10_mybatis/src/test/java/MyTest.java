import com.kaka.mapper.UserMapper;
import com.kaka.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-10 15:20
 */
public class MyTest {
    @Test
    public void mytest() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserMapper mapper = context.getBean("userMapper2", UserMapper.class);

        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
