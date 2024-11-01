package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void flip()
    {
        int x1=x;
        x=-y;
        y=-x1;
    }
    double distance(Point point)
    {
        return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }

    public String toString()
    {
        return String.format("(%d,%d)",x,y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
