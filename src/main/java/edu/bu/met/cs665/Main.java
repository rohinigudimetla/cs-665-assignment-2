/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Main.java
 * Description: This is the main class. No significant output returned.
 */

package edu.bu.met.cs665;
import java.util.Scanner;
import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    Shop shop = new Shop("Sample Shop");

    Product product1 = new Product("Product 1");
    Product product2 = new Product("Product 2");

    shop.addProduct(product1);
    shop.addProduct(product2);

    Order order = new Order(shop, product1);

    DeliveryRequest deliveryRequest = new DeliveryRequest();

    Scanner scanner = new Scanner(System.in);

    System.out.println("=========================================");

    scanner.close();
  }

}
