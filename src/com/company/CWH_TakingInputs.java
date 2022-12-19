package com.company;
import java.util.Scanner;

public class CWH_TakingInputs {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        //int a = sc.nextInt()
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of these numbers");
        System.out.println(sum);
        System.out.println("Check whether it is integer or not");
        Boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.println("Enter the string 1");
        String str = sc.next();
        //prints the single word
        System.out.println(str);
        System.out.println("Enter string 2");

        String s = sc.nextLine();
        //prints the whole sentence/line
        System.out.println(s);
    }
}
