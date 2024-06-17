package org.example;


    //non static class
    public class Student {
        int age;
        String name;
        String studentId;

        public void study() {
        }

        public void eat() {
        }
    }
    class Dog{
        public static void main(String[] args) {
            Student student = new Student();
            student.age = 10;
            student.name = "ritika";
            student.eat();
            student.study();
        }
    }

