package com.impatient.ch03;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

/**
 * Created by sjchen on 8/9/16.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Persons[] people = {
                new Persons("George", "Washington"),
                new Persons("John", "Adams"),
                new Persons("Thomas", "Jefferson"),
                new Persons("James", "Madison"),
                new Persons("James", "Monroe"),
                new Persons("John", "Quincy", "Adams"),
                new Persons("Andrew", "Jackson"),
                new Persons("Martin", "van Buren"),
                new Persons("William", "Henry", "Harrison"),
                new Persons("John", "Tyler"),
                new Persons("James", "Knox", "Polk"),
                new Persons("Zachary", "Taylor"),
                new Persons("Millard", "Fillmore"),
                new Persons("Franklin", "Pierce"),
                new Persons("James", "Buchanan"),
                new Persons("Abraham", "Lincoln"),
                new Persons("Andrew", "Johnson"),
                new Persons("Ulysses", "S.", "Grant"),
                new Persons("Rutherford", "Birchard", "Hayes"),
                new Persons("James", "Abram", "Garfield"),
                new Persons("Grover", "Cleveland"),
                new Persons("Benjamin", "Harrison"),
                new Persons("Grover", "Cleveland"),
                new Persons("William", "McKinley"),
                new Persons("Theodore", "Roosevelt"),
                new Persons("William", "Howard", "Taft"),
                new Persons("Woodrow", "Wilson"),
                new Persons("Warren", "Gamaliel", "Harding"),
                new Persons("Calvin", "Coolidge"),
                new Persons("Herbert", "Hoover"),
                new Persons("Franklin", "Delano", "Roosevelt"),
                new Persons("Harry", "S.", "Truman"),
                new Persons("Dwight", "David", "Eisenhower"),
                new Persons("John", "Fitzgerald", "Kennedy"),
                new Persons("Lyndon", "Baines", "Johnson"),
                new Persons("Richard", "Mulhouse", "Nixon"),
                new Persons("Gerald", "Ford"),
                new Persons("James", "Earl", "Carter"),
                new Persons("Ronald", "Reagan"),
                new Persons("George", "Herbert Walker", "Bush"),
                new Persons("William", "Jefferson", "Clinton"),
                new Persons("George", "Walker", "Bush"),
                new Persons("Barack", "Hussein", "Obama")
        };

        Arrays.sort(people, Comparator.comparing(Persons::getName));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people,
                Comparator.comparing(Persons::getLastName)
                        .thenComparing(Persons::getFirstName));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Persons::getName,
                (s, t) -> s.length() - t.length()));

        Arrays.sort(people, Comparator.comparingInt(p -> p.getName().length()));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, comparing(Persons::getMiddleName,
                nullsFirst(naturalOrder())));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, comparing(Persons::getName,
                reverseOrder()));
        System.out.println(Arrays.toString(people));
    }
}
