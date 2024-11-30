package com.parwez.SpringSecDemo.controller;

import com.parwez.SpringSecDemo.model.User;
import com.parwez.SpringSecDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @PostMapping("register")
    public User register(@RequestBody User user)
    {
        return service.saveUser(user);
    }
}
