package com.service.discovery.client.eurekaclient.controller;

import com.service.discovery.client.eurekaclient.service.UserService;
import com.service.discovery.client.eurekaclient.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser(){
        String user = userService.getUser();
        return new ResponseEntity<String>(user, HttpStatus.OK);
    }

}
