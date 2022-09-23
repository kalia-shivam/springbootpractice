package com.springboot.practice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("HelloWorld")
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld()
    {
        return "This is Hello World api";
    }

}
