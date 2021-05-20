package com.marceramirez;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                String line = "";
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || j == i || (number - i + 1) == j) {
                        line += "*";
                    } else {
                        line += " ";
                    }
                }
                System.out.println(line);
            }
        }
    }
}