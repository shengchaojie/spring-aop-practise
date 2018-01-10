package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect2 {


    @Pointcut("@annotation(aop.TestAnnotation)")
    public void pointcut2(){}

    @Before("pointcut2()")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("test annotation before");
    }

    @After("pointcut2()")
    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("test annotation after");
    }
}
