package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventBusApplication.class, args);
    }

}
