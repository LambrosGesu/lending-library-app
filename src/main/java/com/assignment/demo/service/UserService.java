package com.assignment.demo.service;

import com.assignment.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findByNameAndSurname(String name, String surname);
    User createUser(User user);
    User updateUser(User user, String name, String surname);
    void deleteUserByNameAndSurname(String name, String surname);
}
