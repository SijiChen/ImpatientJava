package com.impatient.ch02;

import java.util.ArrayList;

/**
 * Created by sjchen on 8/7/16.
 */
public class ReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        ArrayList<String> people = friends;
        people.add("Paul");
        System.out.println(friends);
        System.out.println(friends == people);
    }
}
