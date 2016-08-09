package com.impatient.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by sjchen on 8/9/16.
 */
public class MethodRefDemo {
    public static void main(String[] args) {
        String[] strings = {"Mary", "had", "a", "little", "lamb"};
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        list.removeIf(Objects::isNull);
        list.forEach(System.out::println);
    }
}
