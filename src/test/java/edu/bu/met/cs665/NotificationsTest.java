/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: NotificationsTest.java
 * Description: These are the test cases to check the number of drivers objects created,
 * comparison of outputs after a delivery was chosen, and to check the driver's availability
 */
package edu.bu.met.cs665;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationsTest {
    private Driver driver;
    private DeliveryRequest deliveryRequest;
    Shop shop1 = new Shop("Shop1");
    Shop shop2 = new Shop("Shop2");
    Product product1 = new Product("Product1");
    Product product2 = new Product("Product2");
    Shop shop3 = new Shop("Shop3");
    Shop shop4 = new Shop("Shop4");
    Product product3 = new Product("Product3");
    Product product4 = new Product("Product4");
    @BeforeEach
    public void setup() {
        // Create a new Driver object with a dummy DeliveryRequest
        deliveryRequest = new DeliveryRequest();
        deliveryRequest.addOrder(new Order(shop1, product1));
        deliveryRequest.addOrder(new Order(shop2, product2));
        deliveryRequest.addOrder(new Order(shop3, product3));
        deliveryRequest.addOrder(new Order(shop4, product4));

//        driver = new Driver(1, deliveryRequest);
    }

    @Test
    public void testNumberOfInitializedDrivers() {
        // Create a list to hold the initialized drivers
        List<Driver> drivers = new ArrayList<>();

        // Initialize some drivers and add them to the list
        drivers.add(new Driver(1, deliveryRequest));
        drivers.add(new Driver(2, deliveryRequest));
        drivers.add(new Driver(3, deliveryRequest));
        drivers.add(new Driver(4, deliveryRequest));
        drivers.add(new Driver(5, deliveryRequest));

        // Display the number of initialized drivers
        System.out.println("Number of initialized drivers: " + drivers.size());

        // Check if the number of initialized drivers matches the expected value
        assertEquals(5, drivers.size());
    }


    @Test
    public void testDriverAvailabilityTrue() {
    // Create a new DeliveryRequest object
    DeliveryRequest deliveryRequest = new DeliveryRequest();

    // Create a driver with ID 1
    Driver driver = new Driver(1, deliveryRequest);

    // Set driver availability to true
    driver.updateAvailability(true);

    // Get the availability of the driver
    boolean availability = driver.isAvailable();

    // Expected availability is true
    assertTrue(availability);
  }

        @Test
    public void testDisplayAvailableOrders() {
        driver = new Driver(1, deliveryRequest);
        driver.setChoice(1);
        List<Object> result = driver.displayAvailableOrders();

        // Create the expected output list with specific types
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1); // Driver ID
        expectedOutput.add(List.of("Shop1 - Product1", "Shop2 - Product2", "Shop3 - Product3", "Shop4 - Product4")); // List of orders
        expectedOutput.add(1); // Choice
        expectedOutput.add(false); // Availability
        // Print the expected and actual lists
        System.out.println("Expected Output:");
        System.out.println(expectedOutput);

        System.out.println("Actual Result:");
        System.out.println(result);

        // Check if result contains the expected information
        assertEquals(expectedOutput, result);
    }



}
