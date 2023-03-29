package com.firstwebapi.controller;

import com.firstwebapi.model.User;
import com.firstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> list(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getBy(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}
