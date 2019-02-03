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

        String Shop;
        out.print("Checking sales goals:");
        Shop = keyboard.nextLine();

        String Veggies;
        out.print("Sales goal for veggies sandwhiches is " + goalForVeggies);
        Veggies = keyboard.nextLine();

        int veggiesCount;
        out.print("How many veggie sandwhiches were sold today?");
        veggiesCount = keyboard.nextInt();

        if (veggiesCount < 50) {
            out.println("Fell short");
        }
        if (veggiesCount >= 50)  {
            out.println("Meets goal!");
        }
        String burgers;
        out.println("Sales goal for burgers is " + goalForBurgers);
        burgers = keyboard.nextLine();

        int burgersCount;
        out.print("How many burgers were sold today? ");
        burgersCount = keyboard.nextInt();

        if (burgersCount < 250) {
            out.println("Fell short");
        }
        if (burgersCount >= 250) {
            out.println("Meets goal!");
        }
        String subs;
        out.println("Sales goal for subs is " + goalForSubs);
        subs = keyboard.nextLine();

        int subsCount;
        out.print("How many subs were sold today? ");
        subsCount = keyboard.nextInt();

        if (subsCount < 180) {
            out.println("Fell short");
        }
        if (subsCount >= 180) {
            out.println("Meets goal!");
            String soup;
            out.println("Sales goal for soup is " + goalForSoup);
            soup = keyboard.nextLine();

            int soupCount;
            out.print("How many soups were sold today? ");
            soupCount = keyboard.nextInt();

            if (soupCount < 70) {
                out.println("Fell short");
            }
            if (veggiesCount >= 70) {
                out.println("Meets goal!");
            }
            if (veggiesCount >= 50 && burgersCount >= 250 && subsCount >= 180 && soupCount >= 70) {
                out.print("Made goal for everything!");
            }
        }
    }
}
