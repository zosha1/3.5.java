package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    private ProductManager manager = new ProductManager();

    private Product banan = new Product(1, "banan", 27);
    private Book roman = new Book(2, "Вино из одуванчиков", 500, "Рэй Брэдбери");
    private Smartphone phone = new Smartphone(3, "Galaxy", 300, "Samsung");


    @Test
    public void searchBook() {
        manager.add(banan);
        manager.add(roman);
        manager.add(phone);
        Product[] actual = manager.searchBy("Брэдбери");
        Product[] expected = new Product[]{roman};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchPhone() {
        manager.add(banan);
        manager.add(roman);
        manager.add(phone);
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{phone};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchProduct() {
        manager.add(banan);
        manager.add(roman);
        manager.add(phone);
        Product[] actual = manager.searchBy("banan");
        Product[] expected = new Product[]{banan};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchBook2() {
        Product[] actual = manager.searchBy("Брэдбери");
        Product[] expected = new Product[0];
        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchPhone2() {
        manager.add(phone);
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{phone};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchProduct2() {
        manager.add(phone);
        Product[] actual = manager.searchBy("banan");
        Product[] expected = new Product[0];
        assertArrayEquals(actual, expected);
    }
}
