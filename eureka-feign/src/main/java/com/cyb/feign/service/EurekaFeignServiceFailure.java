package com.cyb.feign.service;

import org.springframework.stereotype.Service;

@Service
public class EurekaFeignServiceFailure implements EurekaFeignService{
    @Override
    public String getInfo() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }
}
