package com.company;

import java.util.Scanner;

public class to_find_number_is_prime_or_not {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int a =sc.nextInt();
        int count=0;
        for (int i =1;i<=a;i++){
            //here initialize i=1 to avoid arithmatical error
            if (a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }
        else
            System.out.println("It is not a prime number");

    }
}
