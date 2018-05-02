package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class TestAspect {

    @Pointcut("execution(* *.hello(..))")
    public void pointcut1(){}

    @Pointcut("@annotation(aop.TestAnnotation)")
    public void pointcut2(){}

    @Order(1)
    @Before("pointcut2()")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("test before 1");
    }

    @Order(1)
    @After("pointcut2()")
    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("test after 1");
    }
}
