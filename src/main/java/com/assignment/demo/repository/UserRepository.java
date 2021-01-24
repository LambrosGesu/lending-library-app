package com.assignment.demo.repository;

import com.assignment.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNameAndSurname(String name, String surname);
    List<User> findAll();

    void deleteUserByNameAndSurname(String name, String surname);

//    @Query(value="SELECT DISTINCT user FROM User user WHERE user.username = :username")
//    User findUserByUsername(@Param("username") String username);
}
