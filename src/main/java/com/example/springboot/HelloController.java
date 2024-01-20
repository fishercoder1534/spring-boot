package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public static String STRING_TO_DISPLAY = "Greetings from Spring Boot!";

    @GetMapping("/")
    public String index() {
        return STRING_TO_DISPLAY;
    }

}
