package com.impatient.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by sjchen on 8/12/16.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        ListIterator<String> iter = friends.listIterator();
        iter.add("Fred");
        iter.add("william");
        iter.previous();
        iter.add("Barey");
        System.out.println(friends);

        Iterator<String> i = friends.iterator();
        while (i.hasNext()) {
            System.out.println(i.toString());
        }

    }
}
