package com.marceramirez;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int last = number % 10;
        if (number < 0) {
            return -1;
        }
        while (number >= 10) {
            number /= 10;
        }
        return number + last;
    }
}
