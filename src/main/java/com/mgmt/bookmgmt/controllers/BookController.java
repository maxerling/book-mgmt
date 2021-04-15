package com.mgmt.bookmgmt.controllers;

import com.mgmt.bookmgmt.dao.BookDAOImpl;
import com.mgmt.bookmgmt.models.Book;
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
    private BookDAOImpl bookDao;


    public BookController() {
        this.bookDao = new BookDAOImpl();
    }

    @GetMapping("/books")
        public List<Book> getBooks() {
        return bookDao.getAllBooks();
        }
}
