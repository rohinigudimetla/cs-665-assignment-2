/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Shop.java
 * Description: This is the shop class.
 */
package edu.bu.met.cs665;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Product> products;

    public Shop(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
