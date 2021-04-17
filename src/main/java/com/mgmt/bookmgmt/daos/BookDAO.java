package com.mgmt.bookmgmt.daos;

import com.mgmt.bookmgmt.models.Book;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public interface BookDAO {
    List<Book> getAllBooks();
    void createBook(Book book);
    Book readBook(int id);
    Book readBook(String title);
    void updateBook(Book book);
    void deleteBook(String title);
}
