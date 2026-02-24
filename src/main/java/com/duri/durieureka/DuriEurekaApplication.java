package com.duri.durieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DuriEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuriEurekaApplication.class, args);
    }

}
