package diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author : kaka
 * @Date: 2021-10-10 14:48
 */
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====执行前======");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====执行后======");
    }

    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("环绕前");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }

}
