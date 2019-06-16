package com.example.penghui.service;


import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String queryUserById(int id) {
        return "user home";
    }
}

