package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {

    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("test before");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("test after");
    }

    public void around(JoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        ((ProceedingJoinPoint)joinPoint).proceed(joinPoint.getArgs());
        System.out.println("around after");
    }

    public void throwRuntimeException(JoinPoint joinPoint,RuntimeException exception){
        System.out.println("thoring");
    }

    public void afterReturn(JoinPoint joinPoint){
        System.out.println("after return");
    }


}
