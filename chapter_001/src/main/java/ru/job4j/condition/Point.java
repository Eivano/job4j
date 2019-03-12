package ru.job4j.condition;

public class Point {
    public double distance(int x1=0, int y1=0, int x2=0, int y2=10) {
        double first = Math.pow(x2 - x1, 2) + (y2 - y1, 2);
        return Math.sqrt(first);
    }
}