package com.company;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.println("Enter the marks of all subjects to calculate the cgpa");
        //marks should be out of 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of first subject");
        float a = sc.nextFloat();
        System.out.println("Marks of second subject");
        float b = sc.nextFloat();
        System.out.println("Marks of third subject");
        float c = sc.nextFloat();
        System.out.println("Marks of fourth subject");
        float d = sc.nextFloat();
        System.out.println("cgpa :");
        float cgpa = (a + b + c + d)/40;
        System.out.println(cgpa);


    }
}
