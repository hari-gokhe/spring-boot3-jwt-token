package com.bezkoder.spring.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/test")
    public String test(){
        return "Welcome";
    }

    @GetMapping("/current-user")
    public String getLoginUser(Principal principal){
        return principal.getName();
    }
}
