package aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        HelloService helloService = (HelloService)applicationContext.getBean("helloService");
        helloService.hello("123");
        helloService.bye("scj");
    }
}
