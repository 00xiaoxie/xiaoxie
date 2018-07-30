package com.hsbc.superBank.execulting.modules.hello.controller;

import com.hsbc.superBank.execulting.modules.hello.entity.Greeting;
import com.hsbc.superBank.execulting.modules.hello.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: xiaoxie
 * @Description:
 * @Date:Create in 16:01 2018/7/30
 * @Modify By:
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingService service;

    @RequestMapping("/greeting")
    public @ResponseBody
    String greeting() {
        return service.greet();
    }
}