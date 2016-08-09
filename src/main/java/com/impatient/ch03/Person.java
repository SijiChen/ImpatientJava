package com.impatient.ch03;

/**
 * Created by sjchen on 8/9/16.
 */
public interface Person {
    String getName();
    default int getId(){
        return 0;
    }
}
