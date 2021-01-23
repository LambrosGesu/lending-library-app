package com.assignment.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "LENDING")
public class Lending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lending_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "book")
//    private Book book;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "return_date")
    private String returnDate;

    public Lending() {
    }

//    public Lending(User user, Book book, String issueDate) {
//        this.user = user;
//        this.book = book;
//        this.issueDate = issueDate;
//    }
}
