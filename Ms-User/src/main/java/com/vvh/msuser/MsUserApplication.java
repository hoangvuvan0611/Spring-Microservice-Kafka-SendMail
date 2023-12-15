package com.vvh.msuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsUserApplication.class, args);
    }

}
