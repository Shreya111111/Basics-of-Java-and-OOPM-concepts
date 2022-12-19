package com.company;

public class typecasting_grades {
    public static void main(String[] args) {
        char grade = 'B';
        //converting into char data type
        grade = (char)(grade + 8);
        System.out.println(grade);

        //decrypting into char data type
         grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
