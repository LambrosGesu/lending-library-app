package com.assignment.demo.service;

import com.assignment.demo.enums.Status;
import com.assignment.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();
    Optional<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByYear(String year);
    List<Book> findByStatus(Status status);
    Book createBook(Book book);
    Book updateBook(Book book, String title);
    void deleteBookByTitle(String title);
}
