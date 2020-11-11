package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//        int result = 1 + 2; // 1 + 2 = 3
//        System.out.println("1 + 2 = " + result);
//
//        int previousResult = result;
//        result = result - 1;
//        System.out.println("previousResult = " + previousResult);
//        System.out.println("3 - 1 = " + result);
//
//        result = result * 10; // 2 * 10 = 20
//        System.out.println("2 * 10 = " + result);
//
//        result = result / 5; // 20 / 5 = 4
//        System.out.println("20 / 5 = " + result);
//
//        result = result % 3; // 4 % 3 = 1
//        System.out.println("4 % 3 = " + result);
//
//        result++; // 1 + 1 = 2;
//        System.out.println("1 + 1 = " + result);
//
//        result--; // 2 - 1 = 1;
//        System.out.println("2 - 1 = " + result);
//
//        result += 2; // 1 + 2 = 3;
//        System.out.println("1 + 2 = " + result);
//
//        result *= 10; // 3 * 10 = 30;
//        System.out.println("3 * 10 = " + result);
//
//        result /= 3; // 30 / 3 = 10;
//        System.out.println("30 / 3 = " + result);
//
//        result -= 2; // 10 - 2 = 8;
//        System.out.println("10 - 2 = " + result);
//
//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It is not an alien");
//        }
//
//        int topScore = 100;
//        boolean isOverHundred = topScore > 100;
//            System.out.println("isOverHundred " + isOverHundred);

        // Challenge
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double valuesTotal = (firstValue + secondValue) * 100d;
        System.out.println("valuesTotal = " + valuesTotal);
        double theRemainder = valuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean hasNoReminder = theRemainder == 0;
        System.out.println("hasNoReminder = " + hasNoReminder);
        if (!hasNoReminder) {
            System.out.println("Got some remainder");
        }

    }
}
