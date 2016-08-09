package com.impatient.ch03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sjchen on 8/9/16.
 */
public class SortDemo {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));

        friends = new String[]{"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

