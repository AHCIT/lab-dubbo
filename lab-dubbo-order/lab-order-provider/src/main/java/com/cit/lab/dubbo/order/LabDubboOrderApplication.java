package com.cit.lab.dubbo.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LabDubboOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabDubboOrderApplication.class, args);
    }

}
