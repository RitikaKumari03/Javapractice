package org.example.Encapsulation;

import java.util.Scanner;

import static org.example.Encapsulation.Gender.FEMALE;
import static org.example.Encapsulation.Gender.MALE;

public class MainClass {
    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();
        Identification i = new Identification();
        Address a = new Address();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the student name");
        String name = scanner.nextLine();
        s.setName(name);

        System.out.println("enter the rollNumber of student");
        String rollNumber = scanner.nextLine();
        s.setRollNumber(rollNumber);

        System.out.println("enter the libraryCard");
        String libraryCard = scanner.nextLine();
        s.setLibraryCard(Integer.parseInt(libraryCard));

        System.out.println("enter the hostelFacility");
        String hostelFacility = scanner.nextLine();
        s.setHostelFacility(Boolean.parseBoolean(hostelFacility));

        System.out.println("enter the busFacility");
        String busFacility = scanner.nextLine();
        s.setBusFacility(Boolean.parseBoolean(busFacility));

        System.out.println("enter the courseName");
        String courseName = scanner.nextLine();
        c.setCourseName(courseName);

        System.out.println("enter the courseDuration");
        String courseDuration = scanner.nextLine();
        c.setCourseDuration(Integer.parseInt(courseDuration));

        System.out.println("enter the identificationNumber");
        String identificationNumber = scanner.nextLine();
        i.setIdentificationNumber(Integer.parseInt(identificationNumber));

        System.out.println("enter the identificationType");
        String identificationType = scanner.nextLine();
        i.setIdentificationType(identificationType);

        System.out.println("enter the houseNumber");
        String houseNumber = scanner.nextLine();
        a.setHouseNumber(Integer.parseInt(houseNumber));

        System.out.println("enter the pinCode");
        String pinCode = scanner.nextLine();
        a.setPinCode(Integer.parseInt(pinCode));

        System.out.println("enter the gender");
        String gender=scanner.nextLine();
        Gender gg=Gender.valueOf(gender);
        System.out.println(gg);

        s.setName("name");
        s.setRollNumber(rollNumber);
        s.setStream(c);
        s.setAddress(a);
        s.setIdentification(i);
        s.setLibraryCard(Integer.parseInt(libraryCard));
        s.setGender(gg);

        System.out.println(s);
    }


}





























