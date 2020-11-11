package com.marceramirez;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(157.9);
        String formattedCentimeters = new DecimalFormat("#.####").format(centimeters);
        System.out.println( formattedCentimeters + "cm");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12) ) {
            System.out.println("Invalid input");
            return -1;
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        int feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


//    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//    }
//
//    private static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    private static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    private static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }
}
