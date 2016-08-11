package com.impatient.ch05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sjchen on 8/11/16.
 */
public class TryFinallyDemo {
    public static Lock myLock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(
                    () -> {
                        try {
                            for (int k = 1; k <= 1000; k++) {
                                myLock.lock();
                                try {
                                    counter++;
                                    Thread.sleep(1);

                                } finally {
                                    myLock.unlock();
                                }
                            }
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
            );
        }
        for (Thread t : threads) {
            t.start();
        }

        threads[0].interrupt();
        for (Thread t : threads) t.join();
        System.out.println(counter);
    }
}
