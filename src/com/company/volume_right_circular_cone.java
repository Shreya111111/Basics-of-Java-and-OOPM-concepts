package com.company;
import java.util.Scanner;

public class volume_right_circular_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height");
        float radius = sc.nextFloat();
        float height =sc.nextFloat();

        //formula
        double volume =(3.14*radius*radius*height)/3.0D ;
        System.out.println("The volume of right circular cone is "+volume);


    }
}
