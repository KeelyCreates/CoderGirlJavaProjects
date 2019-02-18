package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop {

    public static void main(String[] args) {
//change name file: public class Sandwich Shop --> for a new document
       Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.print("Checking sales goals:");
        keyboard.skip("\n");

        out.println("Sales goal for veggies sandwhiches is " + goalForVeggies);
        int veggiesCount;
        out.println("How many veggie sandwhiches were sold today?");
        veggiesCount = keyboard.nextInt();
        keyboard.skip("\n");

        if (veggiesCount < 50) {
            out.println("Fell short");
        }
        if (veggiesCount >= 50)  {
            out.println("Meets goal!");
        }

        out.println("Sales goal for burgers is " + goalForBurgers);
        int burgersCount;
        out.print("How many burgers were sold today? ");
        burgersCount = keyboard.nextInt();
        keyboard.skip("\n");

        if (burgersCount < 250) {
            out.println("Fell short");
        }
        if (burgersCount >= 250) {
            out.println("Meets goal!");
        }

        out.println("Sales goal for subs is " + goalForSubs);
        int subsCount;
        out.print("How many subs were sold today? ");
        subsCount = keyboard.nextInt();
        keyboard.skip("\n");

        if (subsCount < 180) {
            out.println("Fell short");
        }
        if (subsCount >= 180) {
        out.println("Meets goal!");
        }

        out.println("Sales goal for soup is " + goalForSoup);
        int soupCount;
        out.print("How many soups were sold today? ");
        soupCount = keyboard.nextInt();
        keyboard.skip("\n");

        if (soupCount < 70) {
            out.println("Fell short");
        }
        if (soupCount >= 70) {
            out.println("Meets goal!");
        }
        if (veggiesCount >= 50 && burgersCount >= 250 && subsCount >= 180 && soupCount >= 70) {
            out.print("Made goal for everything!");
            }
    }
}
