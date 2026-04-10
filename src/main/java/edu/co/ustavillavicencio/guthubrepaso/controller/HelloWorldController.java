package edu.co.ustavillavicencio.guthubrepaso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")


public class HelloWorldController {
    @GetMapping("/world")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping("/ronaldo")
    public String helloRonaldo() {
        return "Hello Ronaldo!";
    }
    @GetMapping ("/mancera")
    public String helloMancera() {
        return "Hello Mancera!";
    }
}
