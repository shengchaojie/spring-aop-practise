package com.scj.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("没有生成AOP代理");
        HelloService helloService1 = applicationContext.getBean("helloService",HelloService.class);
        helloService1.bye("scj");
        helloService1.hello("scj");
        System.out.println("======================================================================");

        System.out.println("生成AOP代理");
        HelloService helloService2 = applicationContext.getBean("aop",HelloService.class);
        helloService2.bye("scj");
        helloService2.hello("scj");
        System.out.println("======================================================================");

        System.out.println("使用Adivisor");
        HelloService helloService3 = applicationContext.getBean("aop2",HelloService.class);
        helloService3.bye("scj");
        helloService3.hello("scj");
        System.out.println("======================================================================");

        System.out.println("Advice或Adivisor顺序影响结果");
        HelloService helloService4 = applicationContext.getBean("aop3",HelloService.class);
        helloService4.bye("scj");
        helloService4.hello("scj");

        //声明式
        IntegrateService integrateService =applicationContext.getBean(IntegrateService.class);
        integrateService.test();

    }
}
