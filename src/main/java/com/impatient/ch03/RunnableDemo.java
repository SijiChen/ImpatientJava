package com.impatient.ch03;

/**
 * Created by sjchen on 8/9/16.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}

/**
 * print out Hello World! 100 times
 * overite run()
 */
class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
        }
    }
}