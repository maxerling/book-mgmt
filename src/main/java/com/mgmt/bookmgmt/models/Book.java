package com.mgmt.bookmgmt.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-27
 * Copyright: MIT
 * Class: Java20B
 */
public class Book {
    private int id;
    private String title;
    private int price;
    private List<Author> authors;

    public Book(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.authors = new ArrayList<>();
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "com.mgmt.bookmgmt.models.Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", authors=" + authors +
                '}';
    }
}
