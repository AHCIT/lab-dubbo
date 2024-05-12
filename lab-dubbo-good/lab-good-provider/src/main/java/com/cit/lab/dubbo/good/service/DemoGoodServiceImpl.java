package com.cit.lab.dubbo.good.service;

import com.cit.lab.dubbo.good.api.demo.DemoGoodService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoGoodServiceImpl implements DemoGoodService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}