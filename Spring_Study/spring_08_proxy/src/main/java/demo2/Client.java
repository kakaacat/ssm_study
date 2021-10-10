package demo2;

/**
 * @Author : kaka
 * @Date: 2021-10-09 19:22
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
