package com.company;

public class finally_block {
    public static int msg(){
        try{
            int a =50;
            int b= 33;
            int c= a/b;
            return c;
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End of the process");
        }
        return 0;
    }

    public static void main(String[] args) {
        int ab = msg();
        System.out.println(ab);
        int a =10;
        int c =33;
        while (true){
            try {
                System.out.println("Result :");
                System.out.println(a/c);
            }
            catch (java.lang.Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("End of the program");
            }
            c--;
        }
        try {
            System.out.println(200/3);
        } finally {
            System.out.println("show the exception and it is finally executed");
        }
    }
}
