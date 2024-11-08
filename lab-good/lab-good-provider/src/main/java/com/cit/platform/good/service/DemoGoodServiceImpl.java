package com.cit.platform.good.service;

import com.cit.platform.good.api.DemoGoodService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoGoodServiceImpl implements DemoGoodService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}