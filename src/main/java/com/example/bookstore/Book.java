package com.example.bookstore;

public class Book {
    public String id;
    public String title;
    public String author;
    public int price;

    public Book(String number, String title, String author, int price) {
        this.id = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

}
