package org.example.abstraction;

public class Hp extends Laptop{

    @Override
    public void motherboard() {
        System.out.println("motherboard");
    }

    @Override
    public void slim() {
        System.out.println("slim");
    }
}
