package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Signup {
    @GetMapping("/signup")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String signup() {
        return "signup"; // returns HTML VIEW (greeting)
        
    } 
}

