package com.company;
import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[2];
        marks[0]=55;
        marks[1]=95;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter the index of the array");
            int index = sc.nextInt();
            try {
                System.out.println("Nested try catch program");
                try {
                    System.out.println(marks[index]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index out of bound exception");
                    System.out.println(e);
                }
            }
            catch (java.lang.Exception e){
                System.out.println("Other exception");
                System.out.println(e);
            }
        }
        System.out.println("End of the program");
    }
}
