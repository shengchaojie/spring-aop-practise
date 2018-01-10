package aop;

import org.aspectj.lang.JoinPoint;

public class TestAspect {

    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("test before");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("test after");
    }
}
