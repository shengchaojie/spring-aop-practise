package com.scj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BService {

    @Autowired
    private AService aService;

}
