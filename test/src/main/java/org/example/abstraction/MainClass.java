package org.example.abstraction;

public class MainClass {
    public static void main(String[] args) {
        Laptop l=new Hp();
        l.motherboard();
        l.slim();
    }
}
