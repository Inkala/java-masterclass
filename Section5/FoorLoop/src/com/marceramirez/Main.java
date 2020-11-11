package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//        for (int i = 2; i < 9; i++) {
//            String formattedValue = String.format("%.2f", calculateInterest(10000.0, i));
//            System.out.println("10,000 at " + i + "% interest = " + formattedValue);
//        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime");
                if (count == 10) {
                    System.out.println("Found enough prime numbers. Exiting loop");
                    break;
                }
            }
        }
    }

//    private static Object calculateInterest(double amount, double interestRate) {
//        return amount * (interestRate / 100);
//    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
