import com.kaka.pojo.Books;
import com.kaka.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-17 16:17
 */
public class MyTest {
    @Test
    public void test1(){
       ApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = contex.getBean("BookServiceImpl", BookService.class);

        List<Books> booksList = bookServiceImpl.queryAllBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }
}
