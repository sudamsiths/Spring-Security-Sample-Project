package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    @PostMapping("/login")
    public String login() {
        return "Login successful!";
    }
}

