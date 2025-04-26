package com.example.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {
    static ArrayList<Book> inventur = new ArrayList<Book>();
    static {
        inventur.add(new Book("1","first","author_1",100));
        inventur.add(new Book("2","second","author_2",200));
        inventur.add(new Book("3","third","author_3",300));
        inventur.add(new Book("4","fourth","author_3",400));
    }
    public Book book;


    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return inventur;
    }

    @PostMapping("/books")
    public void addBook(Book book) {
        inventur.add(book);
    }

    @PostMapping("/books/{id}")
    public Book getBookById(@PathVariable String id) {
        for (Book book : inventur) {
            if (book.getId().equals(id)) {
                return book;
            } else System.out.println("book doesn't exist");
        }
        return null;
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook() {
        inventur.clear();
    }
}
