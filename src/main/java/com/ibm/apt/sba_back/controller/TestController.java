package com.ibm.apt.sba_back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value ="/test",method = RequestMethod.GET)
    String getTest(){
        return "test";
    }
}
