package com.cyb.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class).start();
    }
}
