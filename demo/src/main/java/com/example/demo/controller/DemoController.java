package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoController{

    @GetMapping(value = "/hello")
        public String hello(){
            return "hello docker spring boot";
    }
}
