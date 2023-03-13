package com.epam.hometask1.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="customendpoint")
@Component
public class CustomEndpoint {
    @ReadOperation
    @Bean
    public String hi() {
        return "This is my custom endpoint";
    }
}
