package com.carvalhotechsolutions.helloworldspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerHW {

    @GetMapping("/home")
    public String hello() {
        return "Hello World!";
    }

}
