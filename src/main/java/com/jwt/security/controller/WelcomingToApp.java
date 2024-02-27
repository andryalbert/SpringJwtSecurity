package com.jwt.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/welcome")
public class WelcomingToApp {

    @GetMapping("/all")
    public String welcomeAll() {
        return "Welcome every body";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String welcomeAdmin(){
        return "Welcome in your page admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String welcomeUser(){
        return "Welcome in your page user";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String welcomeModerator(){
        return "Welcome in your page moderator";
    }

}
