package com.cit.lab.dubbo.good;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LabDubboGoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabDubboGoodApplication.class, args);
    }

}
