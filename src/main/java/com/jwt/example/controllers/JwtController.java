package com.jwt.example.controllers;

import com.jwt.example.entities.User;
import com.jwt.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class JwtController {
    @Autowired
    UserService userService;
    @GetMapping("/home")
    public ResponseEntity<List<User>> home(){
        return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.addUser(user);
    }
}
