package com.example.storestock.controllers;

import com.example.storestock.models.User;
import com.example.storestock.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }
}
