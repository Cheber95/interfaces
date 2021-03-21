package ru.geekbraines.homework8;

public class Road implements Barriers{
    private String name;
    private double length;

    public Road(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isWall() {
        return false;
    }
}
