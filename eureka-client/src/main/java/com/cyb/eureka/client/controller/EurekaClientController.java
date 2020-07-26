package com.cyb.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EurekaClientController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/info")
    public String info(HttpServletRequest request){

        String message = request.getScheme() + "://" + request.getServerName() + ":" +
                request.getServerPort() + request.getServletPath();
        return message;
    }

}

