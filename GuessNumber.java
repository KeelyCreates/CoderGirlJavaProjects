package com.company;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class GuessNumber {

    public static void main(String[] args) {

    guessGame();
    }
    public static void guessGame () {
        Scanner keyboard = new Scanner(in);
        out.println("I'm thinking of a number between 1 & 100. Guess my number.");
        boolean userNumber = true;
        int guessNumber;
        int myNumber;
            myNumber = (int) (Math.random() * 99 + 1);

        do {
           guessNumber = keyboard.nextInt();
            if (guessNumber < 1 || guessNumber > 100) {
                out.println("Opps! That isn't between 1 & 100...");
            }else if (guessNumber > myNumber) {
                out.println("My number is lower.");
            }else if (guessNumber < myNumber) {
                out.println("My number is higher.");
            }else {
                out.println("Yay!");
            }
        } while (userNumber);
    }

/*    public static void game () {
        Scanner keyboard = new Scanner (in);
        String playAgain;

        out.println("Play again? :D");
        playAgain = keyboard.nextLine();
        if (playAgain.toLowerCase().equals("yes")){
            guessGame();
        }else {
            out.println("Bye... :(");
        }
    } */
}
/*
boolean userNumber = true;
int guessNumber;
do{
guessNumber = keyboard.nextInt();
if (guessNumber <1 || guessNumber >100); {
out.println("Opps! That isn't between 1 & 100...");
userNumber = false;
}else {
break;
}

 */