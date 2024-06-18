package org.example;

    public class UnaryOperator {
        public static void main(String[] args) {
            int number = 10;
            System.out.println(number);
            System.out.println(number--);
            System.out.println(number);
            System.out.println(--number);
            System.out.println(++number);


            Subtraction s = new Subtraction();

            s.number1 = 12;
            s.number2 = 5;
            s.subtraction();
        }
    }

