package com.impatient.ch02;

import java.util.Random;

/**
 * Created by sjchen on 8/7/16.
 */
public class EvilManager {
    private Random generator;

    public EvilManager() {
        generator = new Random();
    }

    public void giveRandomRaise(Employee e) {
        double percentage = 10 * generator.nextDouble();
        e.raiseSalary(percentage);
    }

    public void increaseRandomly(double x) { // Won't work
        double amount = x * 10 * generator.nextDouble();
        x += amount;
    }

    public void replaceWithZombie(Employee e) {
        e = new Employee("", 0);
    }


}
