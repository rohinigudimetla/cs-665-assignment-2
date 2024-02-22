/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Order.java
 * Description: This class creates order objects with the corresponding shops and products
 */
package edu.bu.met.cs665;

import java.util.List;

public class Order {
    private Shop shop;
    private Product product;

    public Order(Shop shop, Product product) {
        this.shop = shop;
        this.product = product;

    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }
    // Remove the selected order from the list of orders


}
