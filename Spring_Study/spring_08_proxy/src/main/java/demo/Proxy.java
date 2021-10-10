package demo;

/**
 * @Author : kaka
 * @Date: 2021-10-09 19:00
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fee();
    }

    //看房
    public void seeHouse(){
        System.out.println("看房");
    }
    //收费
    public void fee(){
        System.out.println("收费");
    }
    //签合同
    public void contract(){
        System.out.println("签合同");
    }

}
