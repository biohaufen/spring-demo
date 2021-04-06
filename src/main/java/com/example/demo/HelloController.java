package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @RequestMapping - old way
    @GetMapping("/hello")
    //required is semantically used here
    public String sayHello(@RequestParam(defaultValue = "World", required = false) String name) {
        return String.format("Hello %s", name);
    }
}
