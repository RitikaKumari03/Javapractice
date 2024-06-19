package org.example;
public class Ritika {
    static int number1;
    static int number2;

    public static void result() {
        System.out.println(number1);
        System.out.println(number2);
    }

    public static void main(String[] args) {
        Ritika.number1=3;
        Ritika.number2=4;
        result();
    }
}