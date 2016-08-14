package com.impatient.ch07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sjchen on 8/13/16.
 */
public class ListPractice {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<? extends Object> objects = strings;
        strings.add("test1");
        strings.add("test2");
        for (Object o : objects) {
            System.out.println(o);
        }

    }
}
