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

       for (int a= 0; a < 4; a++) {
           for (int b = 0; b < 7; b++) {
               System.out.print(temps[a][b] + " ");
           }
           System.out.println();

       }System.out.println();
       System.out.println("Based on this data, here is the average temperatures for the week");

        dailyAvg(temps);
        hourAvg(temps);
        System.out.println("The final average temperature for the week was:");
        overallAvg(temps);
    }

    public static int dailyAvg (int[][] temps) {
        //calculate daily average here
        for (int b = 0; b < 7; b++) {
            int sum = 0;
            int a = 0;
            while (a < temps.length){
                sum += temps[a++][b];  //this isolates the loop to just run the columns/days
            }
        int avg = sum/temps.length;
        System.out.println("Daily avg: " + avg);
        }System.out.println();
        return 0;
    }

    public static int hourAvg (int[][] temps){
        for (int a = 0; a < 4; a++) {
            int sum = 0;
            int b = 0;
            while (b < temps.length) {
                sum += temps[a][b++]; //this isolates the loop to just run the rows/hours
            }int avg = sum / temps.length;
            System.out.println("Hour: " + avg);
        }System.out.println();
        return 0;
    }

    public static int overallAvg (int[][] temps) {
        //calculate daily average here
        int sum = 0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 7; b++) {
                sum += temps[a][b];
            }
        }
        int avg = sum / temps.length/7;
        System.out.println("Overall : " + avg);
        return avg;
    }
}
