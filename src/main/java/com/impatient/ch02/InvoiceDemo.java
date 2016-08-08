package com.impatient.ch02;

/**
 * Created by sjchen on 8/7/16.
 */
public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
