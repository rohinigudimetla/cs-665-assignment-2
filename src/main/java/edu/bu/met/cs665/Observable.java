/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Observable.java
 * Description: This is the observable interface with the addOrder and removeOrder methods
 */
package edu.bu.met.cs665;

public interface Observable {
    public void addOrder(Order order);
    public void removeOrder(Order order);
}
