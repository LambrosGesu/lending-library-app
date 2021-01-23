package com.assignment.demo.repository;

import com.assignment.demo.model.Lending;
import com.assignment.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LendingRepository extends JpaRepository<Lending, Long> {
    Optional<Lending> findById(String id);
    List<Lending> findAll();
    List<Lending> findByUser(User user);
    void deleteLendingById(Long id);

}
