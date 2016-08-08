package com.impatient.ch02;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by sjchen on 8/7/16.
 */
public class CreditCardForm {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();

    static {
        // Add the next twenty years to the array list
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++) {
            expirationYear.add(i);
        }
    }

}
