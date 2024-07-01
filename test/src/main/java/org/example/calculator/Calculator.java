package org.example.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    int num3;
    int subtract;
    int addition;
    int numbers;
    int multiplication;
    int division;

    public void Addition() {
        addition = num1 + num2 + num3;
        System.out.println(addition);
    }
    public void subtraction() {
        subtract = num1 - num2 - num3;
        System.out.println(subtract);
    }
    public void multiplication() {
        multiplication = num1 * num2 * num3;
        System.out.println(multiplication);
    }
    public void division() {
        division = num1 / num2 / num3;
        System.out.println(division);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("enter the num1");
        String num1 = scanner.nextLine();
        c.num1 = Integer.parseInt(num1);

        System.out.println("enter the num2");
        String num2 = scanner.nextLine();
        c.num2 = Integer.parseInt(num2);

        System.out.println("enter the num3");
        String num3 = scanner.nextLine();
        c.num2 = Integer.parseInt(num3);

        System.out.println("SELECT AND ENTER THE NUMBER TO IDENTIFY OPERATION YOU WANT TO PERFORM");
        System.out.println("ADDITION=1,SUBTRACTION=2,DIVISION=3,MULTIPLICATION=4");
        String NUMBER = scanner.nextLine();
        c.numbers = Integer.parseInt(NUMBER);

        if (c.numbers == 1) {
            c.Addition();
            System.out.println(c);
        } else if (c.numbers == 2) {
            c.subtraction();
            System.out.println(c);
        } else if (c.numbers == 3) {
            c.division();
            System.out.println(c);
        } else if (c.numbers == 4) {
            c.multiplication();
            System.out.println(c);
        } else
            System.out.println("Print Error");
    }
}

