package com.company;
import java.util.Scanner;


public class Adding_two_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int c[][]=new int[row][col];
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                a[i][j]= sc.nextInt();

            }
        }
        System.out.println("Enter the elements of second matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        //adding the two matrices
        System.out.println("The addition of matrix one and matrix two is:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println(c[i][j]);
            }
        }
    }
}
