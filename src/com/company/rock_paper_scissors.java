package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 0 for rock, 1 for paper, 2 for scissors");
        System.out.println("Enter the number:");
        int user_input_given = sc.nextInt();
        Random random = new Random();
        int comp_input_given = random.nextInt(3);
        if (user_input_given==comp_input_given){
            System.out.println("Draw");
        }
        else if (user_input_given == 0 && comp_input_given == 2 || user_input_given==1 && comp_input_given==0 || user_input_given==2 && comp_input_given==1){
            System.out.println("User is the winner");
        }
        else
            System.out.println("User lose");

    }
}
