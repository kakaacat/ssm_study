import dao.UserDaoImp;
import services.UserServiceImp;

/**
 * @Author : kaka
 * @Date: 2021-10-08 17:00
 */
public class MyTest {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();

        userServiceImp.setUserDao(new UserDaoImp());

        userServiceImp.getUser();
    }
}
