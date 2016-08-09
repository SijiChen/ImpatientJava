package com.impatient.ch03;


/**
 * Created by sjchen on 8/9/16.
 */
public class Employee implements Person, Identified, Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this("", 0);
    }

    public Employee(double salary) {

        this("", salary);
    }

    public Employee(String name) {

        this(name, 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return Identified.super.getId();
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
