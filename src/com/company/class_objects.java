package com.company;

public class class_objects {
    String name;
    int age;
    int id;
    String Nationality;

//constructor
    public class_objects(String name,
                         int age,
                         int id,
                         String Nationality) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.Nationality = Nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getNationality() {
        return Nationality;
    }

    public String tstring() {
        return ("My name is " + this.getName() + "\n My age is" + this.getAge() + "\nMy id is" + this.getId() + "\nMy nationality is " + this.getNationality());
    }

    public static void main(String[] args) {
        class_objects a = new class_objects("Kia", 15, 6734278, "mexican");
        class_objects b = new class_objects("claire", 19, 673488278, "mexican");
        class_objects c = new class_objects("Brenda", 10, 886734278, "mexican");
        class_objects d = new class_objects("Alexandra", 15, 126734278, "mexican");

        System.out.println(a.tstring());
        System.out.println(b.tstring());
        System.out.println(c.tstring());
        System.out.println(d.tstring());

    }
}