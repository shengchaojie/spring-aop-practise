package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    /**
     * 注解不好的地方是 切面不能共用
     * 在xml配置里面 能共用方法
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        HelloService helloService = (HelloService)applicationContext.getBean("helloServiceImpl");
        helloService.hello("123");
        helloService.bye("scj");
    }
}
