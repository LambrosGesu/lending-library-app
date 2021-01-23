package com.assignment.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "LENDING")
public class Lending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lending_id")
    private Long id;

    @JsonManagedReference
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;

    @JsonManagedReference
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "return_date")
    private String returnDate;

    public Lending() {
    }


    public Lending(User user, Book book, String issueDate, String returnDate) {
        this.user = user;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
}
