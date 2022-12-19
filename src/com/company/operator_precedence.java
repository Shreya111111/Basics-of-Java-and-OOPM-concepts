package com.company;

public class operator_precedence {
    public static void main(String[] args) {
        int x = 36;
        int y = 129;
        int z = x * y/2;
        System.out.println(z);
        //* and / both have same precedence but the associativity is from left to right

        //solving the quadratic
        int a = 443;
        int b = 77;
        int c = 1;
        int k = b*b- 4*a*c/ 2*a;
        // will give incorrect answer for quadratic equation
        System.out.println(k);

        //by using parenthesis(parenthesis has highest precedence)
        int m = (b*b- 4*a*c)/ (2*a) ;
        System.out.println(m);

    }
}
