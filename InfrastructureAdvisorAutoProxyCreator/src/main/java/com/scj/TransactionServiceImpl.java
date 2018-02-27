package com.scj;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionServiceImpl implements TransactionService{

    @Override
    @Transactional
    public void methodA() {
        System.out.println("A");
    }
}
