package com.example.bookstore;

public class Book {
    public String id;
    public String title;
    public String author;
    public int price;

    public Book(String number, String mathe, String baumann, String number1) {
        this.id = number;
        this.title = title;
        this.author = author;
        this.price = Integer.parseInt(number1);
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

}
