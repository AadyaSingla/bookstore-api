package com.example.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/bookstore")
public class Controller {
    static ArrayList<Book> inventory = new ArrayList<Book>();
    static {
        inventory.add(new Book("1","first","author_1",100));
        inventory.add(new Book("2","second","author_2",200));
        inventory.add(new Book("3","third","author_3",300));
        inventory.add(new Book("4","fourth","author_3",400));
    }


    @GetMapping("")
    public ArrayList<Book> getBooks() {
        return inventory;
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        inventory.add(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        for (Book book : inventory) {
            if (book.getId().equals(id)) {
                return book;
            } else System.out.println("book doesn't exist");
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        for (Book book : inventory) {
            if (book.getId().equals(id)) {
                inventory.remove(book);
            } else System.out.println("book doesn't exist");
        }
    }
}
