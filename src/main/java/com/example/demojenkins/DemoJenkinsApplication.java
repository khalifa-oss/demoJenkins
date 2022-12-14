package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
 class Test{
    @GetMapping("/hello")
    public String display(){
        return "hello word ";

    }
    @GetMapping(path = "/test")
    public String displayTest(){
        return "test... ";

    }
}

@SpringBootApplication
public class DemoJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run( DemoJenkinsApplication.class, args );
    }

}
