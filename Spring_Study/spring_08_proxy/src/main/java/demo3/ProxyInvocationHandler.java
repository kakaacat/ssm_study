package demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author : kaka
 * @Date: 2021-10-09 19:45
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是 反射 机制
        seeHouse();
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    //看房
    public void seeHouse(){
        System.out.println("看房");
    }
    //收费
    public void fee(){
        System.out.println("收费");
    }
}
