package com.marceramirez;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int largestPrime = -1;
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            if ((number % i == 0)) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}