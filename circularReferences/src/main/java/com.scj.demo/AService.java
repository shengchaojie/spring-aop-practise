package com.scj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class AService {

    private BService bService;

    public void setbService(BService bService) {
        this.bService = bService;
    }
}
