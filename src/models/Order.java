package models;

import java.util.ArrayList;
import java.util.List;


import java.util.Arrays;

public class Order {
    String name;
    int phoneNumber;
    int[] items;
    double[] prices;
//Constructor
    public Order(String name, int phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }
//GetterANDSetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    //Calculating the total item and price ordered by the user

    public void Bill() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        double vat = totalPrice * 0.13;
        System.out.println("Order details:");
        System.out.println("Name of the customer: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("No of Items ordered: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT is : " + (totalPrice + vat));
    }
}
