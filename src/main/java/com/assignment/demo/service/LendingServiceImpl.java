package com.assignment.demo.service;

import com.assignment.demo.model.Lending;
import com.assignment.demo.model.User;
import com.assignment.demo.repository.LendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LendingServiceImpl implements LendingService{

    @Autowired
    private LendingRepository lendingRepository;

    @Override
    public List<Lending> findAll(){
        return lendingRepository.findAll();
    }

    @Override
    public Optional<Lending> findById(String id){
        return lendingRepository.findById(id);
    }

    @Override
    public List<Lending> findByUser(User user){
        return lendingRepository.findByUser(user);
    }

    @Override
    public Lending createLending(Lending lending) {
        return lendingRepository.save(lending);
    }

    @Override
    public Lending updateLending(Lending lending, Long id){
        Optional<Lending> newLending = lendingRepository.findById(id);
        if(newLending.isPresent()) return lendingRepository.save(newLending.get());
        return null;
    }

    @Override
    public void deleteLendingById(Long id){
        lendingRepository.deleteLendingById(id);
    }

}
