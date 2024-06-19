package org.example.StaticandNonstatic;

public class Student {

        int age;
        String name;
        String studentId;

        public void study() {
            System.out.println(age);
        }

        public void eat() {
            System.out.println(name);

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


