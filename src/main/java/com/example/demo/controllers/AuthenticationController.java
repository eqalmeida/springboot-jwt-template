package com.example.demo.controllers;

import com.example.demo.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/authenticate")
    public String authenticate(Authentication authentication) {
        return service.authenticate(authentication);
    }
}
