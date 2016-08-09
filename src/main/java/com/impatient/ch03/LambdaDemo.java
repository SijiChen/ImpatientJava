package com.impatient.ch03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sjchen on 8/9/16.
 */
public class LambdaDemo {
    public static void main(String[] arg) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);
    }
}
