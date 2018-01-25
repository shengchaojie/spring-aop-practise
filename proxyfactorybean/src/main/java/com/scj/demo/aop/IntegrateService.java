package com.scj.demo.aop;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("integtareService")
public class IntegrateService {

    @Resource(name = "aop")
    private HelloService helloService;

    public void  test(){
        helloService.hello("scj");
    }

}
