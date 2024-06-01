package com.servicedirectory.eurekaclient2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/client2/m2")
    public String get(){
        return "This is Client2";
    }

    @GetMapping("/client2/hello")
    public String hello(){
        return "This is Hello from Client2";
    }
}
