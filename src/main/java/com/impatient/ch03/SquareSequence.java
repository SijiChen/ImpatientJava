package com.impatient.ch03;

/**
 * Created by sjchen on 8/9/16.
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }

    public int next() {
        i++;
        return i * i;
    }
}
