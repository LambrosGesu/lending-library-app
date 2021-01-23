package com.assignment.demo.controller;

import com.assignment.demo.enums.Status;
import com.assignment.demo.model.Book;
import com.assignment.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public List<Book> getBooks(){
        return bookService.findAll();
    }

    @GetMapping("find-by-title")
    public Book findByTitle(@RequestParam String title){
        Optional<Book> book = bookService.findByTitle(title);
        return book.orElse(null);
    }

    @GetMapping("find-by-author")
    public List<Book> findByAuthor(@RequestParam String author){
        List<Book> book = bookService.findByAuthor(author);
        return book.isEmpty()?null:book;
    }

    @GetMapping("find-by-year")
    public List<Book> findByYear(@RequestParam String year){
        List<Book> book = bookService.findByYear(year);
        return book.isEmpty()?null:book;
    }

    @GetMapping("find-by-status")
    public List<Book> findByStatus(@RequestParam Status status){
        List<Book> book = bookService.findByStatus(status);
        return book.isEmpty()?null:book;
    }

    @PostMapping("create-book")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PutMapping("update-book")
    public Book updateBook(@RequestBody Book book, @RequestParam String title){
        return bookService.updateBook(book, title);
    }

    @DeleteMapping("delete-book")
    public void deleteBook(@RequestParam String title){
        bookService.deleteBookByTitle(title);
    }



}
