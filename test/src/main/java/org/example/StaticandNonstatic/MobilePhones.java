package org.example.StaticandNonstatic;

public class MobilePhones {
    static int modelid;
    static String color;
    static String brand;

    public static void cameraquality() {
        System.out.println(brand);
    }

    public static void calling() {
        System.out.println(modelid);
    }

    public static void main(String[] args) {
      MobilePhones.color = "black";
       MobilePhones.brand = "nokia";
       MobilePhones.modelid=12234;
       cameraquality();
       calling();
   }
}




