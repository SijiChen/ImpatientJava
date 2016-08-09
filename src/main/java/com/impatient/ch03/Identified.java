package com.impatient.ch03;

/**
 * Created by sjchen on 8/9/16.
 */
public interface Identified {
    default int getId() {
        return Math.abs(hashCode());
    }
}
