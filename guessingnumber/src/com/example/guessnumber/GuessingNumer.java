package com.example.guessnumber;
    import java.util.Random;
import java.util.Scanner;

    public class GuessingNumer {
        public static void main(String[] args){
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);
            int randomNumber = rand.nextInt(100) + 1;
           //System.out.prntln("Random Number is "+randomNumber);
            int tryCount=0;
            while(true) {
                System.out.println("Enter your guess (1-100) : ");
                int playerGuess = scanner.nextInt();
                tryCount++;
                if (playerGuess == randomNumber) {
                    System.out.println("Correct! You Win!");
                    System.out.println("It took you "+tryCount+" tries.");
                    break;

                }

                if (randomNumber > playerGuess) {
                    System.out.println("Nope! The Number is higher.Guess again.");
                } else {
                    System.out.println("Nope! The Number is lower.Guess again");
                }
            }
            scanner.close();
        }
    }
