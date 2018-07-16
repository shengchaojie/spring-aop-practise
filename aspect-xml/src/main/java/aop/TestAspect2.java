package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by shengchaojie on 2018/5/3.
 */
public class TestAspect2 {

    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("test before2");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("test after2");
    }

    public void around(JoinPoint joinPoint) throws Throwable {
        System.out.println("around before2");
        ((ProceedingJoinPoint)joinPoint).proceed(joinPoint.getArgs());
        System.out.println("around after2");
    }

    public void throwRuntimeException(JoinPoint joinPoint,RuntimeException exception){
        System.out.println("thoring2");
    }

    public void afterReturn(JoinPoint joinPoint){
        System.out.println("after return2");
    }


}
