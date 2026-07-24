package org.example.cicd2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
    @GetMapping("/message")
    public String getMessage(){
        return "Hello";
    }

}
