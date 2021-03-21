package ru.geekbraines.homework8;

public class Wall implements Barriers{
    private String name;
    private double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean isWall() {
        return true;
    }
}
