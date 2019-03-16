package com.company;
import static java.lang.System.*;
public class FizzBuzz {

    public static void main(String[] args) {
        // write your code here
        int counter = 1;
        while(counter <= 100) {
            if (counter % 15 == 0) {
                out.println("FizzBuzz");
            }
            else if (counter % 3 == 0) {
                out.println("Fizz");
            } else if (counter % 5 == 0) {
                out.println("Buzz");
            } else{
                out.println(counter);
            }
        }counter++;
    }
}
