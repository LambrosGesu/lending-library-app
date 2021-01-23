

INSERT INTO USER (firstname, lastname, email, username, password, role) VALUES ('Lambros', 'G', 'lambros.g@mail.com', 'lambros', 'pass1234', 'USER');
INSERT INTO USER (firstname, lastname, email, username, password, role) VALUES ('George', 'Z', 'george@mail.com', 'george', 'pass2345', 'ADMIN');
INSERT INTO USER (firstname, lastname, email, username, password, role) VALUES ('Chris', 'P', 'chris.p@mail.com', 'chris', 'pass3456', 'ADMIN');


INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('War and Peace', '2020', 'Leo Tolstoy', 'AVAILABLE');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('The Grapes of Wrath', '1991', 'Arthur Conan Doyle', 'AVAILABLE');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('The Murderess', '1903', 'Ernest Hemingway', 'RENTED');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('Captain Michalis', '1950',  'James Joyce', 'RENTED');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('Report to Greco', '1965', 'Arthur Conan Doyle', 'AVAILABLE');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('The Last Temptation', '1960', 'Ernest Hemingway', 'RENTED');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('Christ Recrucified', '1954', 'James Joyce', 'AVAILABLE');
INSERT INTO BOOK (book_title, publication_year, author, status) VALUES ('Princess Isambo', '1945', 'Leo Tolstoy', 'RENTED');

INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','2','12/12/2020','10/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('2','4','13/12/2020','11/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','3','14/12/2020','12/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('3','5','15/12/2020','13/07/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','2','16/12/2020','14/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','5','17/12/2020','18/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('3','2','18/12/2020','15/08/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','8','19/12/2020','17/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('1','2','12/12/2020','19/05/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('2','7','12/12/2020','10/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('2','2','12/12/2020','10/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('3','4','12/12/2020','10/02/2021');
INSERT INTO LENDING (user_id, book_id, issue_date, return_date) VALUES ('3','8','12/12/2020','10/02/2021');