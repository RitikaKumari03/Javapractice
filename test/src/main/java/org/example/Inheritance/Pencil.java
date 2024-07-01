package org.example.Inheritance;

public class Pencil{
    private String color;
    private int speed;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
