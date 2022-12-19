package com.company;
import java.util.Scanner;

public class km_2_miles {
    public static void main(String[] args) {
        System.out.println("Enter the number of miles");
        Scanner sc = new Scanner(System.in);
        double miles = sc.nextFloat();
        double km = 0.62137*miles;
        System.out.println(km);
        //similarly can find the miles

    }
}
