package com.company;
 class Employee{
     int id;
     String name;
     int salary;
     public void printDetails(){
         System.out.println("My id is "+id);
         System.out.println("My full name is " +name);
         System.out.println("My salary is "+salary);
     }
 }
public class oops {
    public static void main(String[] args) {
        System.out.println("This is our custom class"); //instantiating a new employee object
        Employee clara = new Employee();
        Employee Alisah = new Employee();
        Employee helly= new Employee();
        Employee Paul = new Employee();
        clara.id=54;
        Alisah.id =373;
        helly.id = 3287;
        Paul.id =2;
        clara.name = "clara Robinson";
        Alisah.name = "Alisah schmidt";
        helly.name = " helly kapoor";
        Paul.name = "Paul keeler";
        clara.salary = 34566;
        Alisah.salary = 288233;
        helly.salary = 238822;
        Paul.salary = 134566;
        clara.printDetails();
        Alisah.printDetails();
        helly.printDetails();
        Paul.printDetails();



    }
}
