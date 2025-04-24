import com.example.bookstore.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {
    static ArrayList<Book> inventur = new ArrayList<Book>();
    static {
        inventur.add(new Book("1","A","B","2"));
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


    @DeleteMapping("/books/{id}")
    public void deleteBook() {
        inventur.clear();
    }
}
