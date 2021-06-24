package ru.netology.domain;

import lombok.Data;

@Data
public class Book extends Product {
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }

        if (this.getAuthor().contains(search)) {
            return true;
        }
        return false;
    }
}