package com.matei.springlearnsession.controller;

import com.matei.springlearnsession.model.entity.UserRecord;
import com.matei.springlearnsession.repository.UserRepository;
import com.matei.springlearnsession.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/users"))
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/all")
    public List<UserRecord> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }

    @GetMapping("/{name}")
    public UserRecord getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }



}
