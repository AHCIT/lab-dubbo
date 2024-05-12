package com.cit.lab.dubbo.order.service;

import com.cit.lab.dubbo.good.api.demo.DemoOrderService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoOrderServiceImpl implements DemoOrderService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}