package com.impatient.ch03;

import java.util.function.IntConsumer;

/**
 * Created by sjchen on 8/9/16.
 */
public class RepeatDemo {
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }

    public static void main(String[] arg) {
        repeat(10, () -> System.out.println("Hello World"));
        repeat(10, i -> System.out.println("Count down: " + (9 - i)));
        repeatMessage("Hello", 10);
    }
}
