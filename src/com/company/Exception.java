package com.company;

public class Exception {
    public static int divN(int a,int b)throws ArithmeticException{
        int div= a/b;
        return div;
    }
    public static void main(String args[]){
        Exception obj= new Exception();
        System.out.println("Exceptional Handling");
        try{
            System.out.println(obj.divN(1003,0));
        }
        catch (ArithmeticException a){
            System.out.println(a);
        }
    }
}

