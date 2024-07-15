package com.example.demojenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MyController {
     @GetMapping
    public String hello(){
         return "hello from basma mouhamed &  monia & wael  & app";
     }
}
