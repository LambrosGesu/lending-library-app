package com.assignment.demo.controller;

import com.assignment.demo.model.User;
import com.assignment.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("find-by-fullname")
    public User findByNameAndSurname(@RequestParam String name,@RequestParam String surname){
        Optional<User> user = userService.findByNameAndSurname(name, surname);
        return user.orElse(null);
    }

    @PostMapping("create-user")
    public User createBook(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("update-user")
    public User updateUser(@RequestBody User user, @RequestParam String name, @RequestParam String surname){
        return userService.updateUser(user, name, surname);
    }

    @DeleteMapping("delete-user")
    public void deleteUser(@RequestParam String name, @RequestParam String surname){
        userService.deleteUserByNameAndSurname(name, surname);
    }
}
