package com.scj.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class HelloServiceImpl implements HelloService{
    @Override
    public void hello(String name) {
        System.out.println("hello"+name);
    }

    @Override
    public void bye(String name) {
        System.out.println("bye"+name);
    }
}
