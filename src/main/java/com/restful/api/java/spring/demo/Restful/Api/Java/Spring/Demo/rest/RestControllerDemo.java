package com.restful.api.java.spring.demo.Restful.Api.Java.Spring.Demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class RestControllerDemo {

    @GetMapping("/test")
    public Map<String, String> getTest() {
        Date date = new Date();

        System.out.println("send response: " + date);

        return Map.of("message", date.toString());
    }
}
