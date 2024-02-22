/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Driver.java
 * Description: This is the driver class. No significant output returned. Driver IDs are entered,
 * choice of delivery is made and the status of the driver's availability is updated.
 */
package edu.bu.met.cs665;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Driver implements Observer{
    private int driverId;
    private boolean available;
    private int choice;
    private DeliveryRequest deliveryRequest;
    public void displayAvailableOrdersForTest() {
        displayAvailableOrders();
    }

    public Driver(int driverId, DeliveryRequest deliveryRequest) {
        this.driverId = driverId;
        this.available = true; // Initially, set all drivers to be available
        this.deliveryRequest = deliveryRequest;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getDriverId() {
        return driverId;
    }

    public boolean isAvailable() {
        return available;
    }

    // Method to update driver availability status
    public void updateAvailability(boolean status) {
        this.available = status;
    }

    // Implementing the update method from the Observer interface



  @Override
  public List<Object> displayAvailableOrders() {
    List<Object> result = new ArrayList<>(); // Initialize the result list
    result.add(driverId);
    List<Order> orders = deliveryRequest.getOrdersForDriver(driverId);

    List<String> orderList = new ArrayList<>();
      for (Order order : orders) {
          orderList.add(order.getShop().getName() + " - " + order.getProduct().getName());
      }
    result.add(orderList);


      if (choice > 0 && choice <= orderList.size()) {
          updateAvailability(false); // Driver is unavailable after choosing an order
          // Remove the selected order from the delivery request
          Order selectedOrder = orders.get(choice - 1);
          deliveryRequest.removeOrder(selectedOrder);
      }
    choice = Math.min(choice, orders.size());
    result.add(choice);



    result.add(this.isAvailable());

    return result;
        }
}
