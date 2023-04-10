package com.example.demojenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApi {
    @GetMapping ("/hello")
    public String display(){
        return "hello word ";

    }
    @GetMapping(path = "/test")
    public String displayTest(){
        return "i come back to test... ";

    }
}
