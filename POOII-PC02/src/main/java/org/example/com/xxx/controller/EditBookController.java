package org.example.com.xxx.controller;

import org.example.com.xxx.model.Book;
import org.example.com.xxx.view.LibraryUI;

public class EditBookController extends BaseController {
    public EditBookController(LibraryUI libraryUI) {
        super(libraryUI);
    }

    public void updateBook(Book updatedBook){
        getBookService().updateBook(updatedBook);
    }

    public void deleteBook(int idBook){
        getBookService().deleteBook(idBook);
    }
}
