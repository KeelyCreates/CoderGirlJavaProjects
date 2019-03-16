package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Song {
    public static void verse1() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played one");
        out.println("He played knick-knack on my thumb");
    }
    public static void verse2() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played two");
        out.println("He played knick-knack on my shoe");
    }
    public static void verse3() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played three");
        out.println("He played knick-knack on my knee");
    }
    public static void verse4() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played four");
        out.println("He played knick-knack on my door");
    }
    public static void verse5() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played five");
        out.println("He played knick-knack on my hive");
    }
    public static void verse6() {
        Scanner keyboard = new Scanner(System.in);
        out.println(" he played six");
        out.println("He played knick-knack on my sticks");
    }
    public static void chorus() {
        Scanner keyboard = new Scanner(System.in);

        out.println("With a knick-knack paddywhack,\n"+
        "Give the dog a bone,\n" +
        "This old man came rolling home.");
        out.println();
    }

    public static void main(String[] args) {
        out.print("This old man");
        verse1();
        chorus();
        out.print("This old man");
        verse2();
        chorus();
        out.print("This old man");
        verse3();
        chorus();
        out.print("This old man");
        verse4();
        chorus();
        out.print("This old man");
        verse5();
        chorus();
        out.print("This old man");
        verse6();
        chorus();

    }

/*
   public static void line1() {
        Scanner keyboard = new Scanner(System.in);
        out.println("This old man he played");
    }

    public static void line2() {
        Scanner keyboard = new Scanner(System.in);
        out.println("He played knick-knack on my ");
    }

    public static void chorus() {
        Scanner keyboard = new Scanner(System.in);

        out.println("With a knick-knack paddywhack,\n" +
                "Give the dog a bone,\n" +
                "This old man came rolling home.");
        out.println();
    }
}
    public static void main(String[] args) {
        line1();
        out.print("one");
        line2();
        out.print("thumb");
        chorus();
        line1();
        out.print("two");
        line2();
        out.print("shoe");
        chorus();
        line1();
        out.print("three");
        line2();
        out.print("knee");
        chorus();
        line1();
        out.print("four");
        line2();
        out.print("door");
        chorus();
        line1();
        out.print("five");
        line2();
        out.print("hive");
        chorus();
        line1();
        out.print("six");
        line2();
        out.print("sticks");
        chorus();
    }
    */
    }


