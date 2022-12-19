package com.company;
import java.util.Scanner;


public class do_while {
    public static void main(String[] args) {
        //print the n natural numbers using do while
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number ");
        int a = sc.nextInt();
        int b = 1;
        do {
            System.out.println(b);
            b++;

        }while (b<=a);

    }



}
