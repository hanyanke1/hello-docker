package com.example.hellodocker.controller;

import com.example.hellodocker.entity.User;
import com.example.hellodocker.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UserRepository userRepository;

    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/Hello")
    public String hello(){
        return "Hello Docker";
    }

    @GetMapping("/db")
    public String db(){
        User user = new User();
        user.setName("Han");
        userRepository.save(user);
        return "Saved user" + user.getName();
    }
}
