package com.cyb.feign.controller;

import com.cyb.feign.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class feignInfo {
    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignInfo")
    public String feignInfo(){
        String message = eurekaFeignService.getInfo();
        return "获取到的信息：" + message;
    }
}
