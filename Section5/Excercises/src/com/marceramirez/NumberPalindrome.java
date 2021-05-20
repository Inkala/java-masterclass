package com.marceramirez;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int digit = number;
        if (number % 10 == 0) {
            return false;
        }
        while (digit != 0) {
            reverse = (reverse * 10) + (digit % 10);
            digit /= 10;
        }
        return number == reverse;
    }
}
