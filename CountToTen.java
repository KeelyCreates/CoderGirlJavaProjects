package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class CountToTen {

    public static String getEnglishWord(int number)
    {
        if (number == 0) {
            return "zero";
        } else if (number == 1) {
            return "one";
        } else if (number == 2) {
            return "two";
        } else if (number == 3) {
            return "three";
        } else if (number == 4) {
            return "four";
        } else if (number == 5) {
            return "five";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "seven";
        } else if (number == 8) {
            return "eight";
        } else if (number == 9) {
            return "nine";
        } else if (number == 10) {
            return "ten";
        }
        return "";
    }

    public static String getSpanishWord(int number)
    {
        if (number == 0) {
            return "cero";
        } else if (number == 1) {
            return "uno";
        } else if (number == 2) {
            return "dos";
        } else if (number == 3) {
            return "tres";
        } else if (number == 4) {
            return "cuatro";
        } else if (number == 5) {
            return "cinco";
        } else if (number == 6) {
            return "seis";
        } else if (number == 7) {
            return "siete";
        } else if (number == 8) {
            return "ocho";
        } else if (number == 9) {
            return "nueve";
        } else if (number == 10) {
            return "diez";
        }
        return "";
    }

    public static String getKoreanWord(int number)
    {
        if (number == 0) {
            return "yeong";
        } else if (number == 1) {
            return "hana";
        } else if (number == 2) {
            return "dul";
        } else if (number == 3) {
            return "set";
        } else if (number == 4) {
            return "net";
        } else if (number == 5) {
            return "dasuto";
        } else if (number == 6) {
            return "yoasut";
        } else if (number == 7) {
            return "illgup";
        } else if (number == 8) {
            return "yeodul";
        } else if (number == 9) {
            return "ahhope";
        } else if (number == 10) {
            return "yuhl";
        }
        return "";
    }
    public static String getWord(String language, int number)
    {
        if (number <= 0) {
            return "Number too small.";
        }if (number > 10){
            return "Number too large.";
        }if ("e".equals(language)){
            return getEnglishWord(number);
        }if ("s".equals(language)){
            return getSpanishWord(number);
        }if ("k".equals(language)){
            return getKoreanWord(number);
        }
        return "Unrecognized language choice.";
    }

    public static void main(String[] args) {
	// write your code here
        out.println("Would you like English, Spanish, or Korean?");
        out.println("Press e s or k");
        Scanner keyboard = new Scanner (System.in);
        String language = keyboard.nextLine();

        out.println("What number do you want the name of? 0-10?");
        int number = keyboard.nextInt();
        keyboard.skip("\n");

        String spelled_out = getWord(language, number);
        out.println("The word for " +number+ " is " +spelled_out);
    }
}
