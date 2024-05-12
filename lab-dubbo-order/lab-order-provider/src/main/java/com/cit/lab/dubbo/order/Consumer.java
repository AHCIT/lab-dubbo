package com.cit.lab.dubbo.order;

import com.cit.lab.dubbo.good.api.demo.DemoOrderService;

import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @DubboReference
    private DemoOrderService demoOrderService;

    @Override
    public void run(String... args) throws Exception {

        String result = demoOrderService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }
}
