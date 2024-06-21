package org.example.ScannerClass;

import java.util.Scanner;

public class DigitalMarketing {
    int numberofsales;
    String sales;
    Boolean profit;

    public void workfromhome() {
    }

    public static void main(String[] args) {
        DigitalMarketing d = new DigitalMarketing();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        String number = scanner.nextLine();
        d.numberofsales = Integer.parseInt(number);
        System.out.println("the number is " + d.numberofsales);
        d.workfromhome();
    }
}




