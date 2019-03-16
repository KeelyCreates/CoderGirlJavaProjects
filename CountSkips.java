package com.company;
import java.util.Scanner;
import static java.lang.System.*;
public class CountSkips {

    //Print user number of '#' until user inputs '0'

    public static void main(String[] args) {
        out.println("Welcome to Bar Chart");
            barChart();
    }

    public static void barChart() {
        Scanner keyboard = new Scanner(System.in);
        int userNumber;
        boolean keepGoing = true;

        while (keepGoing) {
            out.print("number? ");
            userNumber = keyboard.nextInt();
            int width = userNumber;
            for (int b = 0; b < width; b++) {
                out.print("#");
            }if (userNumber == 0) {
                keepGoing = false;
                out.print("Have a good day!");
            }
        }out.println();
    }
}


 /*     //Count skips
        Scanner keyboard = new Scanner(System.in);
        out.println("What number should I count to?");

        int userNumber;
        userNumber = keyboard.nextInt();

        for(int b = 1; userNumber >= b; b++)
        {
            out.print(b);
        }
        out.println();

        for (int b = 0; userNumber > b;)
        {
            out.print(userNumber--);
        }

// Basic for loop, count to 10 by 5's
    int width = 10;
    for (int counter = 5; counter < width; counter ++)
    {
        out.print("#");
    }
    out.println();


//loop to count to 30
    int number = 0;

    while (number <= 30) {
        out.println(number);
        number = number+1;


    //count to 100 by 5's
        for (int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                out.println(i);
            }
        }

*/
