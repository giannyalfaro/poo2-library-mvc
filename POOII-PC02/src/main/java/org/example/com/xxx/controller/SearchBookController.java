package org.example.com.xxx.controller;

import org.example.com.xxx.model.Book;
import org.example.com.xxx.view.LibraryUI;

import java.util.List;
import java.util.stream.Collectors;

public class SearchBookController extends BaseController {

    public SearchBookController(LibraryUI libraryUI) {
        super(libraryUI);
    }

    public List<Book> getBooksByQuery(String query) {
        List<Book> books = getBookService().getAllBooks().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query) ||
                        book.getAuthor().toLowerCase().contains(query))
                .collect(Collectors.toList());
        return books;
    }

    public List<Book> getBooksByGenre(String query) {
        System.out.println(query);
        String genre = query.toLowerCase();
        List<Book> books = getBookService().getAllBooks().stream()
                .filter(book -> book.getGenre().toLowerCase().contains(genre))
                .collect(Collectors.toList());
        return books;
    }

    public Book getBookById(int selectedBookId) {
        return getBookService().getBookById(selectedBookId);
    }

    public List<Book> getAllBooks() {
        return getBookService().getAllBooks();
    }
}
