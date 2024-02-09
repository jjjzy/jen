package com.example.jenkinss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class JenkinssApplication {
    @GetMapping("/test")
    public String testController(){
        return "yes";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinssApplication.class, args);
    }

}
