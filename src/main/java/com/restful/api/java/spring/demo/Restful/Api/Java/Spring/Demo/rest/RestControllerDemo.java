package com.restful.api.java.spring.demo.Restful.Api.Java.Spring.Demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class RestControllerDemo {

    @GetMapping("/test")
    public Map<String, String> getTest() {

        System.out.println("send response: " + new Date());

        return Map.of("message", "This is a test");
    }
}
