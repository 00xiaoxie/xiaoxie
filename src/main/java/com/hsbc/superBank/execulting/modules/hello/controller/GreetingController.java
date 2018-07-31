package com.hsbc.superBank.execulting.modules.hello.controller;

import com.hsbc.superBank.execulting.modules.hello.entity.Greeting;
import com.hsbc.superBank.execulting.modules.hello.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: xiaoxie
 * @Description:  GreetingController的 GET，POST，DELETE，PUT四种请求的转发
 * @Date:Create in 16:01 2018/7/30
 * @Modify By:
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingService service;
    /**
     * @MethodName:greetingWithGET
     * @Description:响应GET请求
     * @return:返回请类型字符串与hello world 拼串  ，数据格式为json
     */
    @GetMapping("/greeting")
    public @ResponseBody String greetingWithGET() {
        return "GET " + service.greet();
    }
    /**
     * @MethodName:greetingWithPOST
     * @Description:响应DELETE请求
     * @return:返回请类型字符串与hello world 拼串  ，数据格式为json
     */
    @PostMapping
    public @ResponseBody String greetingWithPOST() {
        return "POST " + service.greet();
    }
    /**
     * @MethodName:greetingWithDELETE
     * @Description:响应DELETE请求
     * @return:返回请类型字符串与hello world 拼串  ，数据格式为json
     */
    @DeleteMapping("/greeting")
    public @ResponseBody String greetingWithDELETE() {
        return "DELETE " + service.greet();
    }
    /**
     * @MethodName:greetingWithPUT
     * @Description: 响应PUT请求
     * @return: 返回请类型字符串与hello world 拼串  ，数据格式为json
     */
    @PutMapping("/greeting")
    public @ResponseBody String greetingWithPUT() {
        return "PUT " + service.greet();
    }


}