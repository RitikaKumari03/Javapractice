package org.example.ThisKeyword;

public class ThisClass {
   public int age;
   public String name;
   public int rollNo;
    public void UseThisClass(){
        System.out.println("The age is"+ age);
        System.out.println("The name is" +name);
        System.out.println("The rollNo is"+ rollNo);
    }
    public ThisClass(int age,String name,int rollNo){
        this.rollNo=rollNo;
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        ThisClass s=new ThisClass(20,"Ritika",10);
        s.UseThisClass();
    }
}
