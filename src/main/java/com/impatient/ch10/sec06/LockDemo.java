package com.impatient.ch10.sec06;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sjchen on 8/15/16.
 */
public class LockDemo {
    private static int count = 0;
    private static ReentrantLock RE_LOCK = new ReentrantLock();
    private final String LOCK = new String("LOCK");

    public static void main(String[] args) throws InterruptedException {
        Callable<Integer> c1 = () -> {

            RE_LOCK.lock();

            try {
                for (int i = 0; i < 2000; i++)
                    count++;
                System.out.println("c1 : " + count);
            } finally {
                RE_LOCK.unlock();
                return count;
            }


            //else return 0;
        };
        Callable<Integer> c2 = () -> {

                RE_LOCK.lock();

            try {
                for (int i = 0; i < 2000; i++)
                    count++;
                System.out.println("c2 :  " + count);
            } finally {

                RE_LOCK.unlock();
                return count;
            }

            //else return 0;
        };
        Callable<Integer> c3 = () -> {

                RE_LOCK.lock();

            try {
                for (int i = 0; i < 2000; i++)
                    count++;
                System.out.println("c3 : " + count);

            } finally {
                RE_LOCK.unlock();

                return count;
            }
            //else return 0;
        };
//        Runnable r2 = ()->{
//            for(int i=0;i<100;i++)
//                count++;
//        };
//        Runnable r3 = ()->{
//            for(int i=0;i<100;i++)
//                count++;
//        };
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> f1 = executor.submit(c1);
        Future<Integer> f2 = executor.submit(c2);
        Future<Integer> f3 = executor.submit(c3);
        executor.shutdown();
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("tatal : " + count);
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("Final value: " + count);
    }

    /**
     * when the method get called, this object will be locked.
     *
     * @return
     */

    public synchronized String getNewMethod() {

        return "new Product";

    }

    public String getOldBlock() {

        String value = "";


        synchronized (LOCK) {
            value = "old Product";
        }

        synchronized (this) {
            value = value.toLowerCase();
        }

        return value;


    }

    public String withLockedProduct() {
        if (!RE_LOCK.isLocked()) {
            RE_LOCK.lock();
        }
        String value = "";
        try {
            value = "With Lock";
        } finally {
            RE_LOCK.unlock();
        }
        return value;

    }
}
