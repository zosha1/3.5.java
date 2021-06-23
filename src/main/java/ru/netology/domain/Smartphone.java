package ru.netology.domain;

import lombok.Data;

@Data
public class Smartphone extends Product {
    private String brand;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }
}
