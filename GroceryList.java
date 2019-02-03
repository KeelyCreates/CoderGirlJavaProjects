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
// be care naming variables, they have to be consistent to link the code
        String List;
        out.print("List 3 items on your grocery list:");
        List = keyboard.nextLine();

        String itemA;
        out.print("Item 1: ");
        itemA = keyboard.nextLine();

        String itemB;
        out.print("Item 2: ");
        itemB = keyboard.nextLine();

        String itemC;
        out.print("Item 3: ");
        itemC = keyboard.nextLine();

//no touchie all this workie
        String groceryCount;
        out.print("How many of each item do you need?");
        groceryCount = keyboard.nextLine();

        int firstCount;
        out.print("How many " +itemA+": ");
        firstCount = keyboard.nextInt();

        int secondCount;
        out.print("How many " +itemB+": ");
        secondCount = keyboard.nextInt();

        int thirdCount;
        out.print("How many " +itemC+": ");
        thirdCount = keyboard.nextInt();
/*
HOLY SHIT SO FAR IT"S WORKING

Grocery List stops here

String groceryCost;
out.print("How much does each item cost?");
groceryCost = keyboard.nextLine();
*/

        int firstCostInCents;
        out.print("What does " +itemA+ " cost? ");
        firstCostInCents = keyboard.nextInt();

        int secondCostInCents;
        out.print("What does " +itemB+ " cost? ");
        secondCostInCents = keyboard.nextInt();

        int thirdCostInCents;
        out.print("What does " +itemC+ " cost? ");
        thirdCostInCents = keyboard.nextInt();

        String finalTotal;
        out.print("Final Total of Grocery List");
        finalTotal = keyboard.nextLine();

        int priceInCents = (firstCount * firstCostInCents) + (secondCount * secondCostInCents) + (thirdCount * thirdCostInCents);
        float priceInDollars = priceInCents/100f;
        out.print("Your Total Cost Is "+priceInDollars);
//don't delete anything past this comment
        }
    }
//        //int itemCount;
//       // out.println("How Many? ");
//      //  itemCount = keyboard.nextInt();