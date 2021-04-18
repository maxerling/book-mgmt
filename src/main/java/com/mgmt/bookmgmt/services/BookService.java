package com.mgmt.bookmgmt.services;

import com.mgmt.bookmgmt.daos.BookDAOImpl;
import com.mgmt.bookmgmt.models.Book;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-17
 * Copyright: MIT
 * Class: Java20B
 *
 * d
 */
public class BookService {
    private BookDAOImpl bookDAO;

    public BookService() {
        this.bookDAO = new BookDAOImpl();
    }

    //create
    public void createBook(Book book) {
        bookDAO.createBook(book);
    }
    //update
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }
    //select book
    public Book selectBookById(int id) {
       return bookDAO.readBook(id);
    }

    public Book selectBookByTitle(String title) {
        return bookDAO.readBook(title);
    }

    //select books
    public List<Book> selectBooks() {
       return bookDAO.getAllBooks();
    }
    //delete book
    public void deleteBookByTitle(String title) {
        bookDAO.deleteBook(title);
    }
}
