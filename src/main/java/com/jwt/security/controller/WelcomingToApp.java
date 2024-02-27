package com.jwt.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomingToApp {

    @GetMapping("/admin")
    public String welcomeAdmin(){
        return "Welcome in your page admin";
    }

    @GetMapping("/user")
    public String welcomeUser(){
        return "Welcome in your page user";
    }
}
