package com.example.demo.Pojo;

public class Book {
    private Integer id;

    private String title;

    private String reader;

    private String isbn;

    private String description;

    private String authro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader == null ? null : reader.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAuthro() {
        return authro;
    }

    public void setAuthro(String authro) {
        this.authro = authro == null ? null : authro.trim();
    }
}