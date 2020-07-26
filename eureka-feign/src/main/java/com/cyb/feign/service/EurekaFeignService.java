package com.cyb.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client", fallback = EurekaFeignServiceFailure.class)
public interface EurekaFeignService {
    @RequestMapping(value = "/info")
    String getInfo();
}
