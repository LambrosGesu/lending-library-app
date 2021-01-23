package com.assignment.demo.repository;

import com.assignment.demo.enums.Status;
import com.assignment.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByYear(String year);
    List<Book> findAll();
    List<Book> findByStatus(Status status);
    void deleteBookByTitle(String title);

}
