/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: DeliverRequest.java
 * Description: This class allows us to add and remove orders.
 */
package edu.bu.met.cs665;
import java.util.ArrayList;
import java.util.List;

public class DeliveryRequest implements Observable {
    private List<Observer> observers;
    private boolean newRequestAvailable;
    private List<Order> orders;

    public DeliveryRequest() {
        this.orders = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.newRequestAvailable = false;
    }




    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Method to retrieve available orders for a specific driver
    public List<Order> getOrdersForDriver(int driverId) {
        List<Order> availableOrders = new ArrayList<>();
        for (Order order : orders) {
            // Implement logic to check availability and order status based on driverId if needed
            // For now, simply add all orders to the availableOrders list
            availableOrders.add(order);
        }
        return availableOrders;
    }
    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
