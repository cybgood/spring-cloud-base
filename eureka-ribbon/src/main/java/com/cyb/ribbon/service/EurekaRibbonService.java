package com.cyb.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
@Service
public class EurekaRibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoFailure")
    public String getInfo(){
        String message;
        try {
            System.out.println("调用服务 EUREKA-CLIENT/info");
            message = restTemplate.getForObject("http://EUREKA-CLIENT/info", String.class);
            System.out.println("服务 EUREKA-CLIENT/info 返回信息 ：" + message);
            System.out.println("调用 服务 EUREKA-CLIENT/info 成功！");
        } catch (RestClientException e) {
            message = e.getMessage();
        }
        return message;
    }
    public String getInfoFailure(){
        String message = "网络繁忙，请稍后再试";
        return message;
    }
}
