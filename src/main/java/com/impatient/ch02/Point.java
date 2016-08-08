package com.impatient.ch02;

/**
 * Created by sjchen on 8/8/16.
 * An mutable Point class that has 2 coordinates, with method transite to move and scale ;
 * @author Siji Chen
 * @version 1.1
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

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {
        return y;

    }

    public double getX() {

        return x;
    }

    /**
     * translate the point to another locaion
     * @param a the coordinate x change
     * @param b the coordinate y change
     * @return the reference of the same point
     */
    public Point translate(double a, double b) {
        x += a;
        y += b;
        return this;
    }

    /**
     * scale the same point
     * @param s the amont of scale
     * @return the reference of the same point
     */
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
