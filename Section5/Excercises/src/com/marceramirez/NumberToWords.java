package com.marceramirez;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        if (number == 0) System.out.println("Zero");
        int reversedNum = reverse(number);
        int difference = getDigitCount(number) - getDigitCount(reversedNum);
        while (reversedNum > 0) {
            int digit = reversedNum % 10;
            switch (digit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
                default:
                    break;
            }
            reversedNum /= 10;
        }
        for (int i = 0; i < difference; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0) {
            reversedNum = (reversedNum * 10) + (number % 10);
            number /= 10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        do {
            count += 1;
            number /= 10;
        } while (number > 0);
        return count;
    }
}