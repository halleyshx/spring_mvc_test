package com.techbirds.controller;

/**
 * Created by shihuixing on 2017/6/11.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloContorller {
    //hello world 例子
    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("spring mvc hello world");
        return "hello";
    }
}
