package com.marceramirez;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int total = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }
}
