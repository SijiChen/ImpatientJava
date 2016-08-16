package com.impatient.ch06;

/**
 * Created by sjchen on 8/16/16.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.swap(friends,0,1);
        System.out.println(java.util.Arrays.toString(friends));

        Arrays.swap(0,1,friends);
        System.out.println(java.util.Arrays.toString(friends));

        Arrays.printAll(friends,(e)->true);

    }
}
