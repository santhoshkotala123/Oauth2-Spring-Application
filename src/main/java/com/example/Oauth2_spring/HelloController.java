package com.example.Oauth2_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public  String greet(){
        return "Hello Santhosh";
    }

}
