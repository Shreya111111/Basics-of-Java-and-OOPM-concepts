package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Frequency_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns respectively:");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int evencount_1 = 0, oddcount_1 = 0, evencount_2 = 0,oddcount_2 = 0;
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        System.out.println("Matrix 1:");
        for (int i=1;i<=row;i++) {
            for (int j = 1; j <= col; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] % 2 == 0)
                    evencount_1++;
                else
                    oddcount_1++;
            }
        }


        System.out.println("Matrix 2:");
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++) {
                b[i][j]=sc.nextInt();
                if (b[i][j] % 2 == 0)
                    evencount_2++;
                else
                    oddcount_2++;
            }
        }

        System.out.println("Even frequency"+(evencount_1+evencount_2));
        System.out.println("Odd frequency"+(oddcount_1+oddcount_2));
    }
}
