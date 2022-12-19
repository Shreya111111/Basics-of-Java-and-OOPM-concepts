package com.company;
import java.util.Scanner;
public class handling_specific_exception {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0]=387;
        marks[1]=37;
        marks[2]=7;
        marks[3]=307;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the array");
        System.out.println("Enter the number ");
        int ind = sc.nextInt();
        int num = sc.nextInt();
        //Handling multiple exception
        try {
            System.out.println(marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("It was an arithmetic exception");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It was an Array index out of bound exception");
            System.out.println(e);
        }catch (java.lang.Exception e){
            System.out.println("Some other exception");
            System.out.println(e);
        }
    }
}
