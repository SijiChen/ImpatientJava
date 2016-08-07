package com.impatient.ch01;

/**
 * Created by sjchen on 8/7/16.
 */
public class Relational {
    public static void main(String[] arg) {
        int length = 10;
        int n = 7;
        System.out.println(0 <= n && n < length);

        int s = 30;
        System.out.println(n != 0 && s + (100 - s) / n < 50);
    }
}
