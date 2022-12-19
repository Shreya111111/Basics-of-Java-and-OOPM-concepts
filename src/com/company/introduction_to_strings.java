package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class introduction_to_strings {
    public static void main(String[] args) {
        String name = new String("hello");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and the value of b is %8.9f",a,b);
        Scanner sc = new Scanner(System.in);
        //String st = sc.next();
        //System.out.println(st);
        String sl = sc.nextLine();
        System.out.println(sl);

    }
}
