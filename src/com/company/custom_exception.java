package com.company;
import java.util.Scanner;
class MyException extends Exception {
    @Override
    public String toString() {
        return "Executed when sout(e) is ran";
    }

    public String getMessage() {
        return "prints the exception msg";
    }
}
class age extends Exception{
    public  String toString(){
        return "Age cannot be greater than 100";
    }
    public String getMessage(){
        return "Make sure while entering the age";
    }
}

public class custom_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a<100)
        try {
            throw new ArithmeticException("Error!!");
        }
        catch (java.lang.Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Finish");
        }
        System.out.println("End of the Block");
    }
}
