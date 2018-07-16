package aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by shengchaojie on 2018/7/17.
 */
public class TestMain {

    public static void main(String[] args) {
        ProxyFactory proxyFactory =new ProxyFactory();
        proxyFactory.setInterfaces(HelloService.class);
        proxyFactory.setTarget(new HelloServiceImpl());
        proxyFactory.addAdvisor(new DefaultIntroductionAdvisor(new DelegatingIntroductionInterceptor(new CryServiceImpl())));
        HelloService helloService = (HelloService) proxyFactory.getProxy();
        helloService.bye("scj");
        helloService.hello("scj");
        CryService cryService =(CryService)proxyFactory.getProxy();
        cryService.cry();

        ProxyFactory proxyFactory2 =new ProxyFactory();
        proxyFactory2.setInterfaces(HelloService.class);
        proxyFactory2.setTarget(new HelloServiceImpl());
        proxyFactory2.addAdvisor(new DefaultIntroductionAdvisor(new TestIntroduction()));
        HelloService helloService2 = (HelloService) proxyFactory2.getProxy();
        helloService2.bye("scj");
        helloService2.hello("scj");
        CryService cryService2 =(CryService)proxyFactory2.getProxy();
        cryService2.cry();
    }
}
