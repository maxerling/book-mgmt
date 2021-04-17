package com.mgmt.bookmgmt.services;

import com.mgmt.bookmgmt.dao.BookDAOImpl;
import com.mgmt.bookmgmt.models.Book;

/**
 * Created by Max Erling
 * Date: 2021-04-17
 * Copyright: MIT
 * Class: Java20B
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
        bookDAO.updateBook( book);
    }
    //select book
    public void selectBookById(int id) {
        bookDAO.readBook(id);
    }

    public void selectBookByTitle(String title) {
        bookDAO.readBook(title);
    }

    //select books
    public void selectBooks() {
        bookDAO.getAllBooks();
    }
    //delete book
    public void deleteBookByTitle(String title) {
        bookDAO.deleteBook(title);
    }
}
