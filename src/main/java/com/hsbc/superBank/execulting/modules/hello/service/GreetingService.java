package com.hsbc.superBank.execulting.modules.hello.service;

import org.springframework.stereotype.Service;

/**
 * @Author: xiaoxie
 * @Description: Greeting服务类
 * @Date:Create in 16:08 2018/7/30
 * @Modify By:
 */
@Service
public class GreetingService {
    /**
     * @MethodName: greet
     * @Description: 获取Hello World字符串
     * @return: String
     */
    public String greet() {
        return "Hello World";
    }
}
