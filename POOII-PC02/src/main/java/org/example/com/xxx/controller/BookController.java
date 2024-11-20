package org.example.com.xxx.controller;
import org.example.com.xxx.view.LibraryUI;

public class BookController{

    private final LibraryUI libraryUI; // Vista principal

    public BookController() {
        libraryUI = new LibraryUI();
        libraryUI.setVisible(true);
    }
}

