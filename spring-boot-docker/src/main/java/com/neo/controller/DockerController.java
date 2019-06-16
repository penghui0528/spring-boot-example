package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
    @RequestMapping("/")
    public String index() {
		
        return "Hello Docker! 彭辉你为何这么帅！！！";
    }
}