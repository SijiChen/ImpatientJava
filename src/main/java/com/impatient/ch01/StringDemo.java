package com.impatient.ch01;

import java.time.ZoneId;
import java.util.*;

/**
 * Created by sjchen on 8/7/16.
 */
public class StringDemo {
    public static void main(String[] arg) {
        //+ to concat 2 strings
        String location = "Java";
        String greeting = "Hello" + location;

        int age = 42;
        String output = age + "year";

        System.out.println("Next year, you will be " + age + 1);

        StringBuilder builder = new StringBuilder();
        for (String id : ZoneId.getAvailableZoneIds()) {
            builder.append(id);
            builder.append(", ");
        }
        System.out.println(builder.toString().substring(0, 200) + "...");

        String javatm="Java\u2122";
        System.out.println(javatm);
        System.out.println(Arrays.toString(javatm.codePoints().toArray()));
        System.out.println(javatm.length());

        String oct = "\ud835\udd46";
        System.out.println(oct);
        System.out.println(Arrays.toString(oct.codePoints().toArray()));
        System.out.println(oct.length());
    }
}
