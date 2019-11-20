package com.cyb.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private Registration registration;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(registration.getServiceId());

        return "Hello World";
    }
}
