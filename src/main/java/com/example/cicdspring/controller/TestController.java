package com.example.cicdspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "get test mapping";
    }

    @GetMapping("/test")
    public String test2() {
        return "get test2 mapping";
    }
}
