package com.marceramirez;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        long average = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                double test = (double)sum / counter;
            } else {
                break;
            }
            scanner.nextLine();
        }

        if (counter == 0) {
            average = 0;
        } else {
            average = Math.round((double)sum / counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}