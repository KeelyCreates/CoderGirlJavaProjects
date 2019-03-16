package com.company;
import java.util.Scanner;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        double number = 0;
        double sum = 0;
        int count = 0;
        boolean addingNumbers = true;

        out.println("Welcome to Adding Machine!\n" +
                    "Total = 0");
        while (addingNumbers == true) {
            out.print("Add: ");
            number = keyboard.nextDouble();
            count++;
            sum += number;
            out.println("Total: " +sum);
            if (number == 0) addingNumbers = false;
        }
        out.println("You entered numbers "+count+", for a final total of " +sum);
    }
}
