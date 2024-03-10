package com.jwt.example.services;

import com.jwt.example.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User addUser(User user);

}
