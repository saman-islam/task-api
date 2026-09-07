package com.example.taskapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TaskController {

    // Endpoint 1: GET /health -> returns plain text "ok"
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }

    // Endpoint 2: GET /hello -> returns simple JSON
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hello, World!");
    }
}