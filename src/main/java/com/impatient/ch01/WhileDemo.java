package com.impatient.ch01;

import java.util.Random;

/**
 * Created by sjchen on 8/7/16.
 */
public class WhileDemo {
    public static void main(String[] agr) {
        Random generator = new Random();
        int sum = 0;
        int count = 0;
        int target = 90;
        while (sum < target) {
            int next = generator.nextInt(10);
            sum = sum + next;
            count++;
        }
        System.out.println("After " + count + " iteration, the sum is " + sum);
    }
}
