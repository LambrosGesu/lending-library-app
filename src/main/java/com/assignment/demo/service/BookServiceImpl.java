package com.assignment.demo.service;

import com.assignment.demo.enums.Status;
import com.assignment.demo.model.Book;
import com.assignment.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> findByYear(String year){
        return bookRepository.findByYear(year);
    }

    @Override
    public List<Book> findByStatus(Status status){
        return bookRepository.findByStatus(status);
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book, String title){
       Optional<Book> newBook = bookRepository.findByTitle(title);
       if (newBook.isPresent()){
           newBook.get().setAuthor(book.getAuthor());
           newBook.get().setYear(book.getYear());
           newBook.get().setStatus(book.getStatus());
           newBook.get().setTitle(book.getTitle());
           return bookRepository.save(newBook.get());
       }
       return null;
    }

    @Override
    public void deleteBookByTitle(String title){
        bookRepository.deleteBookByTitle(title);
    }

}
