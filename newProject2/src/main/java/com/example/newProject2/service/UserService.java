package com.example.newProject2.service;

import com.example.newProject2.exception.UserNotFoundException;
import com.example.newProject2.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {
    private static final Map<String, User> USERS = new HashMap<>();

    public User findById(String id){
        var user = USERS.get(id);

        if (user == null) {
            throw new UserNotFoundException("User not found ID"+ id);
        }
        return user;
    }
    public User create(User user){
        var id = UUID.randomUUID().toString();
        user.setId
    }
}
