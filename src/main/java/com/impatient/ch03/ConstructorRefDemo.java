package com.impatient.ch03;

import java.util.ArrayList;

/**
 * Created by sjchen on 8/9/16.
 */
public class ConstructorRefDemo {
    public static void main(String[] arg) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] eCf = names.stream().map(Employee::new).toArray(Employee[]::new);
        for (Employee e : eCf) System.out.println(e.getName());
    }
}
