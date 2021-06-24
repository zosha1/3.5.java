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

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }

        if (this.getBrand().contains(search)) {
            return true;
        }
        return false;
    }

}
