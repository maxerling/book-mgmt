package com.mgmt.bookmgmt.controllers;

import com.mgmt.bookmgmt.daos.BookDAOImpl;
import com.mgmt.bookmgmt.models.Book;
import com.mgmt.bookmgmt.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-11
 * Copyright: MIT
 * Class: Java20B
 *
 *
 * Goal: Update page correctly withhout handling it locally
 */
@Controller
public class ViewController {

    private BookService bookService;

    public ViewController() {
        this.bookService = new BookService();
    }
    @GetMapping("/")
    public String getIndex(Model model) {
        List<Book> books = bookService.selectBooks();;
        model.addAttribute("books",books);
        return "index.html";
    }

    @GetMapping("/new")
    public String getBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("newBook", book);
        return "bookform.html";
    }

    @PostMapping(value = "/create")
    public String submitForm(@ModelAttribute("newBook") Book book) {
        bookService.createBook(book);
        //books.add(bookDao.readBook(book.getTitle()));
        return "book_added.html";

    }

    @GetMapping("/edit")
    public String editBook(@RequestParam int id, Model model) {
        Book book = bookService.selectBookById(id);
        model.addAttribute("book",book);
        return "bookform.html";
    }


    @PostMapping("/edit")
    public String submitEditedForm(@ModelAttribute("book") Book book) {
        bookService.updateBook(book);
        int index = -1;
        /*for (Book b : books) {
            if (b.getId() == book.getId()) {
                index = books.indexOf(b);
            }
        }

        books.set(index,book);*/
        return "book_edited";
    }



    @GetMapping(value = "/delete")
    public String deleteBook(@RequestParam int id, Model model) {
        int index = -1;
        Book book = bookService.selectBookById(id);
        model.addAttribute("book",book);
        bookService.deleteBookByTitle(book.getTitle());
        return "delete.html";
    }

    @GetMapping("/list")
    public String listAllBooks(Model model) {
        List<Book> books = bookService.selectBooks();;
        model.addAttribute("books",books);
        return "allBooks";
    }








}
