package com.company;

public class TemperatureArray {

    public static void main(String[] args) {
	// Data chart here
    int temps [][] = {{68, 70, 76, 70, 68, 71, 75},
                     {76, 76, 87, 84, 82, 75, 83},
                     {83, 72, 81, 78, 76, 73, 77,},
                     {64, 65, 69, 68, 70, 74, 72}};
    //nested for loop to print data into a grid
    System.out.println("Temperature Chart and Averages" );
    System.out.println("The data provided are: ");

            String times[] = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            for (int row= 0; row < 4; row++) {
                System.out.print(times[row] + " ");
                for (int column = 0; column < 7; column++) {
                    System.out.print(temps[row][column] + " ");
                }
           System.out.println();

       }System.out.println();
       System.out.println("Based on this data, here is the average temperatures for the week");

        dailyAvg(temps);
        hourAvg(temps);
        System.out.println("The final average temperature for the week was:");
        overallAvg(temps);
    }

//----------------------------------------------------------------------------------------------
    public static int dailyAvg (int[][] temps) {
        //calculate daily average here
        //make days a string array
        String weekDays [] = {"Sun", "Mon", "Tues", "Weds", "Thur", "Fri", "Sat"};
        for (int column = 0; column < weekDays.length; column++){
            System.out.print(weekDays[column]);  //has a for loop for each day and...
            int sum = 0;
            for (int row = 0; row < temps.length; row++){
                sum += temps[row][column];  //this isolates the loop to just run the columns/days
            }
            int avg = sum / weekDays.length;
            System.out.println(": " + avg);
        }System.out.println();
        return 0;
    }

//----------------------------------------------------------------------------------------------
    public static int hourAvg (int[][] temps){
        String hour [] = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        for (int row = 0; row < temps.length; row++){
            System.out.print(hour[row]); //has for loop through each time and...
            {
            int sum = 0;
            int column = 0;
            while (column < hour.length) {
                sum += temps[row][column++]; //this isolates the loop to just run the rows/hours
            }
            int avg = sum / temps.length;
            System.out.println(avg); //...then print the average next to the corresponding time
            }
        }System.out.println();
        return 0;
    }
//----------------------------------------------------------------------------------------------
    public static int overallAvg (int[][] temps) {
        //calculate daily average here
        int sum = 0;
        for (int column = 0; column < temps.length; column++) {
            for (int row = 0; row < temps.length; row++) {
                sum += temps[row][column];
            }
        }
        int avg = sum / temps.length/temps.length;
        System.out.println("Overall : " + avg);
        return avg;
    }
}
