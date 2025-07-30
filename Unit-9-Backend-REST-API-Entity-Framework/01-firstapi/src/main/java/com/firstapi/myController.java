package com.firstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// This file contains controller code to handle http requests sent to this server
@RestController
public class myController {
//REST stands for Representational State Transfer
//an architechtural style for designing network applications (type of controller)
    //8081 is the port number that the application is running on

    @GetMapping
    public String anyName() {
        return "Hi There";
    }

    @GetMapping("/welcome")
    public String controllerNameHere(){
        return "Welcome to my first API";
    }
}


