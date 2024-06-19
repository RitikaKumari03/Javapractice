package org.example.StaticandNonstatic;

public class Addition {
    int number1;
    int number2;
    int number3;
    public void add(){
        number3=number1+number2;
        System.out.println(number3);

    }
    public static void main(String args[]){
        Addition a=new Addition();
        a.number1=10;
        a.number2=20;
        a.add();
    }
}
