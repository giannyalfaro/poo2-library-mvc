package org.example.com.xxx.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private int year;

    // Constructor privado para el patrón Builder
    private Book(BookBuilder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.year = builder.year;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author +
                "', genre='" + genre + "', year=" + year + '}';
    }

    // Builder Class
    public static class BookBuilder {
        private int id;
        private String title;
        private String author;
        private String genre;
        private int year;

        public BookBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Book build() {
            if (title == null || author == null) {
                throw new IllegalArgumentException("Title and Author are required.");
            }
            return new Book(this);
        }
    }
}

