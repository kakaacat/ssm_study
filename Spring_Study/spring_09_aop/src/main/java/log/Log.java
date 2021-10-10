package log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author : kaka
 * @Date: 2021-10-10 14:07
 */
public class Log implements MethodBeforeAdvice {

    //method :要执行的目标对象的方法
    //args   : 参数
    //target :目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
