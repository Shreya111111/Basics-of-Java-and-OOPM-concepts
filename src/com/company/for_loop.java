package com.company;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Printing even numbers");
        for (int i =1;i<=a;i++){
            //even numbers using for loop
            System.out.println(2*i);
        }
        System.out.println("Printing odd numbers");
        for(int i =1;i<=a;i++){
            //odd numbers using for loop
            System.out.println(2*i - 1);
        }
        for(int i=1;i<=a;a--) {
            //printing the reverse numbers
            System.out.println(a);
        }
    }
}
