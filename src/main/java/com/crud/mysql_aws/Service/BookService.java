package com.crud.mysql_aws.Service;

import com.crud.mysql_aws.Model.Book;
import com.crud.mysql_aws.Repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public Book getBookById(int bookId) {
        return bookRepo.findById(bookId).orElse(new Book());
    }
}
