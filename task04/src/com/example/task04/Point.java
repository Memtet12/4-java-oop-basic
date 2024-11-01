package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    double distance(Point point)
    {
        return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }

    @Override
    public String toString()
    {
        return String.format("(%d,%d)",x,y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
