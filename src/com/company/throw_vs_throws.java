package com.company;
class neg extends java.lang.Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class throw_vs_throws {

    public static double area(int r) throws neg {
        if (r < 0) {
            throw new neg();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        try {
            double ar = area(33);
            System.out.println(ar);
            int i = divide(33,33);
            System.out.println(i);
        } catch (java.lang.Exception e) {
            System.out.println("Exception");
        }

    }
}


