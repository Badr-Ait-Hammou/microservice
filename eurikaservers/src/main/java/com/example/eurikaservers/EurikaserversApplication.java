package com.example.eurikaservers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaserversApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurikaserversApplication.class, args);
    }

}
