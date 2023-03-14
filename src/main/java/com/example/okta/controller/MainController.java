package com.example.okta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.okta.model.User;
import com.example.okta.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/home")
    public String home(){
        return " hello Home";
    }
// @GetMapping("/users")
//     public List<User> getUsers(){
//         return userRepository.findAll(); 
//     }
@GetMapping("/users")
    public List<String> getUsers(){
        return List.of("test","TEST","Test");
    }
@PostMapping("/save")
public void addUser(@RequestBody User user){
    userRepository.save(user);
}
@GetMapping("/test")
public String test(){
    return "test";
}
}
