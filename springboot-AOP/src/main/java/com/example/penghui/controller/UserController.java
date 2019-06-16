package com.example.penghui.controller;

import com.example.penghui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/queryUserById/{id}")
    @ResponseBody
    private String queryUserById(@PathVariable int id){
        System.out.println("----path-----"+id);
        return userService.queryUserById(id);
    }



    @GetMapping("/user/queryUserById2")
    @ResponseBody
    private String queryUserById2(@RequestParam(required=true) int id ){
        System.out.println("----RequestParam-----"+id);
        return userService.queryUserById(id);
    }

}

