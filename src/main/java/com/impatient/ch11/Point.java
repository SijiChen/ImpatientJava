package com.impatient.ch11;

/**
 * Created by sjchen on 8/12/16.
 */
@ToString(includeName = false)
public class Point {
    @ToString(includeName=false)private int x;
    @ToString(includeName=false)private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public boolean equals(@ReadOnly Point this, @ReadOnly Object obj){
        Point other = (Point) obj;
        return x==other.x&&y==other.y;
    }

    public static void main(String[] args) {
        System.out.println(new Point(1,2).equals(new Point(1,2)));

    }
}
