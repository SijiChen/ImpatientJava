package com.impatient.ch02;

/**
 * Created by sjchen on 8/7/16.
 */
public class Employee {
    private String name;
    private double salary;
    private int id;
    private static int lastId = 0;


    public Employee(String name, double salary) {
        lastId++;
        id = lastId;
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("", salary);
    }

    public Employee(String name) {
        this(name, 0.0);
    }

    public Employee() {
        this("", 0.0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
