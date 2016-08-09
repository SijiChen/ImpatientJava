package com.impatient.ch03;

import java.util.Random;

/**
 * Created by sjchen on 8/9/16.
 */
public class LocalClassDemo {
    private static Random generator = new Random();

    /**
     * using local class
     *
     * @param low
     * @param high
     * @return
     */
    public static IntSequence randomInts(int low, int high) {
        class RandomSequence implements IntSequence {
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }

            public boolean hasNext() {
                return true;
            }
        }
        return new RandomSequence();
    }

    /**
     * use anonymous class
     *
     * @param low
     * @param high
     * @return
     */
    public static IntSequence randomInts_A(int low, int high) {
        class RandomSequence implements IntSequence {
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }

            public boolean hasNext() {
                return true;
            }
        }
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        };
    }

    public static void main(String[] arg) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++)
            System.out.println(dieTosses.next());
        IntSequence dieTossesA = randomInts_A(1, 6);
        for (int i = 0; i < 10; i++)
            System.out.println(dieTossesA.next());
    }
}
