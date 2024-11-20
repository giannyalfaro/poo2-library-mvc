package org.example.com.xxx.controller;

import org.example.com.xxx.repository.BookRepository;
import org.example.com.xxx.service.BookService;
import org.example.com.xxx.view.LibraryUI;

public class BaseController {

    private final BookService bookService;
    private final LibraryUI libraryUI;

    public BaseController(LibraryUI libraryUI) {
        this.libraryUI = libraryUI;
        BookRepository bookRepository = new BookRepository("jdbc:mysql://localhost:3306/library", "root", "set2502Ale");
        bookService = new BookService(bookRepository);
    }

    public BookService getBookService() {
        return bookService;
    }

    public LibraryUI getLibraryUI() {
        return libraryUI;
    }
}
