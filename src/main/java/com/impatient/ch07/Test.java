package com.impatient.ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by sjchen on 8/12/16.
 */
public class Test {
    public static void printNames(ArrayList<?extends Objects> staff){
        for(int i=0;i<staff.size();i++){
            Objects o = staff.get(i);
            System.out.println(o.toString());

        }
    }
    public static void main(String[] args) {
        Map<String, Integer> h = new HashMap<>();
        h.put("a", null);
        System.out.println(h.keySet());
        h.compute("a", (k, v) -> null);
        System.out.println(h.keySet());
    }
}
