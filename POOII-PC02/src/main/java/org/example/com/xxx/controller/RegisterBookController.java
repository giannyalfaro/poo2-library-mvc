package org.example.com.xxx.controller;

import org.example.com.xxx.model.Book;
import org.example.com.xxx.view.LibraryUI;

import java.util.List;

public class RegisterBookController extends BaseController{

    public RegisterBookController(LibraryUI libraryUI) {
        super(libraryUI);
    }

    public void addBook(Book book){
        try {
            getBookService().addBook(book);
            getLibraryUI().showMessage("Book added successfully!");
            getLibraryUI().clearInputFields();
        } catch (NumberFormatException ex) {
            getLibraryUI().showError("Year must be a number!");
        }
    }
}
