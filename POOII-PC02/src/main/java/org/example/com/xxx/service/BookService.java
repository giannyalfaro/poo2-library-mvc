package org.example.com.xxx.service;

import org.example.com.xxx.model.Book;
import org.example.com.xxx.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // Registrar un nuevo libro
    public void addBook(Book book) {
        try {
            repository.save(book);
            System.out.println("Book saved successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating book: " + e.getMessage());
        }
    }

    // Buscar libros por título
    public List<Book> searchBooksByTitle(String title) {
        return repository.findByTitle(title);
    }

    // Buscar libros por autor
    public List<Book> searchBooksByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public void updateBook(Book updatedBook) {
        repository.update(updatedBook);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void deleteBook(int id) {
        repository.delete(id);
    }

    public Book getBookById(int id) {
        return repository.getBookById(id); // Consulta al repositorio
    }
}
