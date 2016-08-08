package com.impatient.ch02;

import java.util.ArrayList;

/**
 * Created by sjchen on 8/7/16.
 */
public class Invoice {
    private static class Item { // Item is nested inside Invoice
        private String description;
        private int quantity;
        private double unitPrice;

        double price() {
            return quantity * unitPrice;
        }

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public Item() {
        }

        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description,quantity,unitPrice);
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        int i=1;
        for (Item item : items) {
            System.out.println(i+": "+item);
            total += item.price();
            i++;
        }
        System.out.println("summary: "+total);
    }

}
