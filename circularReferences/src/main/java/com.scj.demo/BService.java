package com.scj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class BService {

    private AService aService;

    public void setaService(AService aService) {
        this.aService = aService;
    }
}
