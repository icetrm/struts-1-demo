package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import com.example.demo.dto.User;

public class LoginService {
	//hard-coded
    private static List<User> users = Arrays.asList(new User("admin", "admin"));
    
    public User searchUser(String username) {
        return users.stream().filter(x -> x.getUsername().equalsIgnoreCase(username)).findFirst().orElse(null);
    }
}
