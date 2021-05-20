package com.marceramirez;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesInADay = 60 * 24;
            long minutesInAYear = minutesInADay * 365;
            long years = minutes / minutesInAYear;
            long days = (minutes % minutesInAYear) / minutesInADay;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
