package com.impatient.ch05;

/**
 * Created by sjchen on 8/11/16.
 */
public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            System.err.println(ex.getMessage());
            System.err.println("Good bye, cruel world!");
        });
        System.out.println(1 / 1);
    }

}
