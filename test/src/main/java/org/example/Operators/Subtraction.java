package org.example.Operators;

public class Subtraction {
    public int number1;
    int number2;
    int subtract;

    public void subtraction() {
        subtract = number1 - number2;
        if (subtract < 5) {
            System.out.println("The number is less than five");
            System.out.println(subtract);
        } else if (subtract > 5 && subtract < 15) {
            System.out.println("The number is between 5 and 15");
            System.out.println(subtract);
        } else if (subtract > 10 && subtract < 20) {
            System.out.println("The number is between 10 and 20");
            System.out.println(subtract);
        } else {
            System.out.println("The number is greater than 20");
            System.out.println(subtract);
        }
        }
    }







