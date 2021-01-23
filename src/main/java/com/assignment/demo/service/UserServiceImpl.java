package com.assignment.demo.service;

import com.assignment.demo.model.User;
import com.assignment.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByNameAndSurname(String name, String surname){
        return userRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, String name, String surname){
        Optional<User> newUser = userRepository.findByNameAndSurname(name, surname);
        if (newUser.isPresent()){
            newUser.get().setName(user.getName());
            newUser.get().setSurname(user.getSurname());
            newUser.get().setEmail(user.getEmail());
            newUser.get().setUsername(user.getUsername());
            newUser.get().setPassword(user.getPassword());
            newUser.get().setRole(user.getRole());
            return userRepository.save(newUser.get());
        }
        return null;
    }

    @Override
    public void deleteUserByNameAndSurname(String name, String surname){
        userRepository.deleteUserByNameAndSurname(name, surname);
    }


}
