package com.example.demo.ui.controller;

import com.example.demo.data.modal.User;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public ArrayList<User> getUser(){

// Dummy Data return without connecting to DB
//        User returnValue = new User();
//        returnValue.setFirstName("Dileep1");
//        returnValue.setLastName("Keeppalli");
//        returnValue.setEmail("dileepkeeppalli@gmail.com");
//        return returnValue;

        // Connected to DB
        return (ArrayList<User>) usersRepository.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public User createUser(@RequestBody User user){

        // Dummy Data return without connecting to DB
//        User returnValue = new User();
//        returnValue.setFirstName(user.getFirstName());
//        returnValue.setLastName(user.getLastName());
//        returnValue.setEmail(user.getEmail());
//        return new ResponseEntity<User>(returnValue, HttpStatus.OK);
        // Connected to DB
        return  usersRepository.save(user);
    }

    @PutMapping
    public String updateUser(){
        return "Update users called111";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete users called2222";
    }

}
