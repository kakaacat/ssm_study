package demo;

/**
 * @Author : kaka
 * @Date: 2021-10-09 18:57
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
