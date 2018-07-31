package com.hsbc.superBank.execulting.modules.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: xiaoxie
 * @Description:
 * @Date:Create in 16:02 2018/7/30
 * @Modify By:
 */
@SpringBootApplication(scanBasePackages = "com.hsbc.superBank.execulting.modules")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
