package com.scj.demo.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class TestAfterAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after ...");
    }
}
