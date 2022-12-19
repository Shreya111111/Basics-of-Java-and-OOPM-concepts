package com.company;
import java.util.Scanner;
import java.util.Random;
class game {
    public int number;
    public int input_number;
    public int noofguesses=0;



    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        input_number = sc.nextInt();
    }

    Boolean isCorrectNumber() {
        noofguesses++;

        if (input_number == number){
            return true;
        }
        else if(input_number <number){
            System.out.println("Small..");
        }
        else if (input_number>number) {
            System.out.println("Big..");

        }
        return false;

    }}
public class newgame {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

