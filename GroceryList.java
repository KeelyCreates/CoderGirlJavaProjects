package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    // please list 3 items on your grocery shopping list
    // Now, please enter the quantity of each item
    // Now, please enter the price of each item.
    // Calculating your grocery bill
    public static void main(String[] args) {
               Scanner keyboard = new Scanner(System.in);

//Grocery list
        out.println("List 3 items on your grocery list:");

        String itemA;
        out.print("Item 1: ");
        itemA = keyboard.nextLine();

        String itemB;
        out.print("Item 2: ");
        itemB = keyboard.nextLine();

        String itemC;
        out.print("Item 3: ");
        itemC = keyboard.nextLine();

//how many of each item
        out.println("How many of each item do you need?");

        int firstCount;
        out.print("How many " +itemA+": ");
        firstCount = keyboard.nextInt();

        int secondCount;
        out.print("How many " +itemB+": ");
        secondCount = keyboard.nextInt();

        int thirdCount;
        out.print("How many " +itemC+": ");
        thirdCount = keyboard.nextInt();

// How much does each item cost?

        float firstCostInCents;
        out.print("What does " +itemA+ " cost? ");
        firstCostInCents = keyboard.nextFloat();

        float secondCostInCents;
        out.print("What does " +itemB+ " cost? ");
        secondCostInCents = keyboard.nextFloat();

        float thirdCostInCents;
        out.print("What does " +itemC+ " cost? ");
        thirdCostInCents = keyboard.nextFloat();

        out.println("Final Total of Grocery List");

        float priceInCents = (firstCount * firstCostInCents) + (secondCount * secondCostInCents) + (thirdCount * thirdCostInCents);
        float priceInDollars = priceInCents/100f;
        out.print("Your Total Cost Is "+priceInDollars);
//don't delete anything past this comment
    }
}
