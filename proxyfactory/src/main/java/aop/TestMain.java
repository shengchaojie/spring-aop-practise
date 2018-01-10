package aop;

import org.springframework.aop.framework.ProxyFactory;

public class TestMain {

    public static void main(String[] args) {
        ProxyFactory proxyFactory =new ProxyFactory();
        proxyFactory.setInterfaces(HelloService.class);
        proxyFactory.setTarget(new HelloServiceImpl());
        proxyFactory.addAdvice(new TestBeforeAdvice());
        proxyFactory.addAdvice(new TestAfterAdvice());
        proxyFactory.addAdvice(new TestAroundAdvice());
        HelloService helloService = (HelloService) proxyFactory.getProxy();
        helloService.bye("scj");
        helloService.hello("scj");
    }
}
