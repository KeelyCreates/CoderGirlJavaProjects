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
        int a, b, c;
        int n; //userNumber
        int size = 21;
        boolean keepGoing = true;

        while (keepGoing) {
            out.println("How large would you like your table?");
            n = keyboard.nextInt();
            for (a = 0; a <= n ; a++) {
                out.println(a + "*" + 0 + " = " + (a * 0));
                for (b = 0; b <= n; b++) {
                    out.println(b + "*" + n + " = " + (b * n));
                }
            }if (n == size) {
                keepGoing = false;
                out.print("end");
            }
        }out.println();
    }
}
//nested Loop practice code
	/*        int rows = 0;
        while (rows++ < 5)
        for (int columns= 0; rows < 4; rows ++) {
            out.print("#");
        }
        out.println();
        for (int columns = 0; columns < 4; columns++) {
            out.print("-");
        }out.println();
*/