package com.company;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in physics");
        m1 = sc.nextByte();
        System.out.println("Enter the marks in chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter the marks in maths");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("The overall percentage"+avg);
        if(avg>=60 && m1>=33 && m2>33 && m3>=33){
            System.out.println("you are promoted");
        }
        else{
            System.out.println("you are failed");
        }

    }
}
