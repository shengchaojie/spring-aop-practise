package aop;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by shengchaojie on 2018/7/17.
 */
public class TestIntroduction extends DelegatingIntroductionInterceptor implements CryService {
    @Override
    public void cry() {
        System.out.println("cry 1.....");
    }
}
