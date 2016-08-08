package com.impatient.ch02;

import java.util.Random;

/**
 * Created by sjchen on 8/7/16.
 */
public class RandomNumber {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
        // Ok to access the static generator variable

    }


}
