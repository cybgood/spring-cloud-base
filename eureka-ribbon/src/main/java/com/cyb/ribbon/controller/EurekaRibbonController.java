package com.cyb.ribbon.controller;

import com.cyb.ribbon.service.EurekaRibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EurekaRibbonController {
    @Resource
    private EurekaRibbonService eurekaRibbonService;
    @RequestMapping("/ribbonInfo")
    public String ribbonInfo(){
        String message = eurekaRibbonService.getInfo();
        return "获取信息：" + message;
    }

}
