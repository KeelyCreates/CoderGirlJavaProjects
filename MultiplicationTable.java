package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class MultiplicationTable {

    public static void main(String[] args) {
        out.println("Welcome to Multiplication Table");
        multiplyNumbers();
    }

    public static void multiplyNumbers() {
        Scanner keyboard = new Scanner(System.in);
        //int rows = a
        //int columns = b
        int a, b; //a = outter number; b = inner number
        int n; //userNumber

        while (true) {
            out.println("How large would you like your table?");
            n = keyboard.nextInt();
            for (a = 0; a <= n; a++) {
                for (b = 0; b <= n; b++) {
                    out.println(a + "*" + b + " = " + (b * a));
                }
            }out.println();
        }
    }
}
