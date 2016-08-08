package com.impatient.ch02;

/**
 * Created by sjchen on 8/8/16.
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double getY() {
        return y;
    }

    public double getX() {

        return x;
    }

    public Point translate(double a, double b) {
        x += a;
        y += b;
        return this;
    }

    public Point scale(double s) {
        x *= s;
        y *= s;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] arg){
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
