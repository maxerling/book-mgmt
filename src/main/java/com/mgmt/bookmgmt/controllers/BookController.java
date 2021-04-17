package com.mgmt.bookmgmt.controllers;

import com.mgmt.bookmgmt.daos.BookDAOImpl;
import com.mgmt.bookmgmt.models.Book;
import com.mgmt.bookmgmt.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-11
 * Copyright: MIT
 * Class: Java20B
 */
@RestController
public class BookController {
    private BookService bookService;


    public BookController() {
       this.bookService = new BookService();
    }

    @GetMapping("/books/all")
        public List<Book> getBooks() {
        return bookService.selectBooks();
        }
}
