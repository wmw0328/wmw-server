package com.yog.yogweb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.yog")
public class YogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YogWebApplication.class, args);
    }

}
