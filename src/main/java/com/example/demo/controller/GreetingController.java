package com.example.demo.controller;

import com.example.demo.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(UUID.randomUUID().toString(), "Hello World");
    }
}
