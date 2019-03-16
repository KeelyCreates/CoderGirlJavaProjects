package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String thereYet = "";
        boolean keepGoing = true;


        System.out.println("That question...");
        while (keepGoing == true)
        {
            System.out.print("Are we there yet? ");
                    thereYet = keyboard.nextLine();
            if (thereYet.equals("yes")) {
                keepGoing = false;
            }else if(!thereYet.equals("no")) {
                System.out.println("Uh...no comprende");
            }
        }
        System.out.print("YAY!!");
    }
    /* Class code:
    boolean keepGoing = true;
    While (keepGoing) {
        System.out.println("Are we there yet?");
        Scanner keyboard = new Scanner(System.in);
        Sting answer = keyboard.nextLine().toLowerCase();

            if(answer.equals("yes"){
                keepGoing = false;
            } else if (!answer.equals("no"){
                System.out.println("No comprende... ")
            }
        }
         System.out.println("YAY")
     */
}
