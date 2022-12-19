package com.company;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n,c,array[],search;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in an array");
        n = sc.nextInt();
        array= new int [n];
        System.out.println("Enter the element that has to be searched");
        search = sc.nextInt();
        System.out.println("Enter the elements of an array");
        for (c=0;c<n;c++)
        {
            array[c]=sc.nextInt();
        }
        for (c=0;c<n;c++) {
            if (array[c] == search) {
                System.out.println(search + "is present at" + (c + 1) + "position");
                break;
            }
        }
            if (c==n){
                System.out.println("Element not found");
            }

    }
}
