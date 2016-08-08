package com.impatient.ch02;

import java.text.NumberFormat;

/**
 * Created by sjchen on 8/7/16.
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        int dieToss = RandomNumbers.nextInt(1, 6);
        System.out.println(dieToss);

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // Prints $0.10
        System.out.println(percentFormatter.format(x)); // Prints 10%
    }
}
