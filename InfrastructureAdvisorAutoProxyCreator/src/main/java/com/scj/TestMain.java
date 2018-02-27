package com.scj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("context.xml");
        TransactionService transactionService = (TransactionService) applicationContext.getBean(TransactionService.class);
        transactionService.methodA();
    }
}
