package com.example.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    //чтобы не писать @ResponseBody для каждого метода
    //можно прописать @RestController


    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
    @GetMapping("/ciao")
    public String ciao(){
        return "Ciao!";
    }
}
