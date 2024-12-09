package com.parwez.SpringSecDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "This is home page....";
    }
    @GetMapping("/hello")
    public String greet(HttpServletRequest request) {

        return "Hello World! ";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request){
        return "About Page" + request.getSession().getId();
    }


}
