package com.project;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        Project Exercise 1
        Name Project    :   Guess Number (Gamification)
        Subject         :   1. Type Data Primitive
                            2. Type Data String
                            3. Do While Loop
                            4. Switch Statement
                            5. Type Data not Primitive
                            6. Variables
                            7. Ternary Operator
        */
        
        // Declaration Variables
        int compNum;
        int userNum;
        String ready;
        String result;
        String inputWhile = "no";
        boolean values = false; 
        Scanner input = new Scanner (System.in);
        
        // Ready to Play??
        System.out.println("\n====>>> ARE YOU READY TO PLAY?? <<<====");
        System.out.println("Gues the Computer Number from 0 to 10!");
        System.out.print("Ready? (yes or no)\t: ");
        ready = input.next();
        if (ready == "no") {
            input.close();
        }
        switch (ready) {
            case "yes" : {
                System.out.println("\nSTART TO GUESS THE COMPUTER NUMBER !!!");
                break;
            }
            case "no" : {
                System.out.println("\nThank You, The Program will be closed!\n");
                return;
            }
        }

        do {

            // Computer Number
            compNum = (int) Math.round(Math.random() * 10);
            
            // Input Number from User
            System.out.print("\nInput Your Guessing Number\t: ");
            userNum = input.nextInt();

            // Rules of the Game
            result = (compNum == userNum) ? "AMAZING, YOU WIN !!!\n" : "OH NO... YOU LOSE, TRY AGAIN !!!\n";

            // Result of the Number
            System.out.println("\nComputer Number\t= " + compNum);
            System.out.println("Your Number\t= " + userNum + "\n");

            // Print Out to the Terminal
            System.out.println(result);

            // Exit or Continue
            System.out.print("Try Again? (yes or no)\t: ");
            inputWhile = input.next();

            switch (inputWhile) {
                case "yes" : {
                    values = true;
                    break;
                }
                case "no" : {
                    values = false;
                    System.out.println("Thank You, the program will be closed!\n");
                    break;
                }
                default : {
                    System.out.println("\ninput is not valid!\n");
                    break;
                }
            }
        } while (values);
        input.close();
    }
}
