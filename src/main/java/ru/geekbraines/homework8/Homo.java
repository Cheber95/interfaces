package ru.geekbraines.homework8;

public class Homo implements Skills{
    private String name;
    private double maxJumpHeight;
    private double maxRunDistance;

    public Homo(String name, double maxJumpHeight, double maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(Road road) {
        if (road.getLength() > maxRunDistance) {
            System.out.printf("%s не смогла пробежать %s (%.1f метров) :(\n", name, road.getName(), road.getLength());
            return false;
        } else {
            System.out.printf("%s пробежал %s длиной %.1f метров\n", name, road.getName(), road.getLength());
            return true;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() > maxJumpHeight) {
            System.out.printf("%s не смогла перепрыгнуть %s высотой %.3f метров :(\n", name, wall.getName(), wall.getHeight());
            return false;
        } else {
            System.out.printf("%s перепрыгнул %s высотой %.3f метров\n", name, wall.getName(), wall.getHeight());
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }
}
