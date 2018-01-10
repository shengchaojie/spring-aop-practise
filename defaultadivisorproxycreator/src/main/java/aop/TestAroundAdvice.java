package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestAroundAdvice implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("around before");
        Object result = invocation.proceed();
        System.out.println("around after");
        return result;
    }
}
