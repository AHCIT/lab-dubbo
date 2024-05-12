package com.cit.lab.dubbo.good;

import com.cit.lab.dubbo.good.api.demo.DemoGoodService;

import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @DubboReference
    private DemoGoodService demoGoodService;

    @Override
    public void run(String... args) throws Exception {

        String result = demoGoodService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }
}
