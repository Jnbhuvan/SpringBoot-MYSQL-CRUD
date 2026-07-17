package com.crud.mysql_aws.Controller;

import com.crud.mysql_aws.Model.Book;
import com.crud.mysql_aws.Service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String hello(){
        return "hello world from Jnbhuvan";

    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        return bookService.getBookById(bookId);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
         bookService.addBook(book);
    }

}
