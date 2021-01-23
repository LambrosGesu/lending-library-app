package com.assignment.demo.service;

import com.assignment.demo.model.Lending;
import com.assignment.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface LendingService {
    Optional<Lending> findById(String id);
    List<Lending> findAll();
    List<Lending> findByUser(User user);
    Lending createLending(Lending lending);
    Lending updateLending(Lending lending, Long id);
    void deleteLendingById(Long id);

}
