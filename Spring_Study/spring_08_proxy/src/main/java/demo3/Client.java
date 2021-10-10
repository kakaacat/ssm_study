package demo3;

/**
 * @Author : kaka
 * @Date: 2021-10-09 19:57
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
