package com.marceramirez;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = readInteger();
        int[] initialArray = readElements(count);
        int min = findMin(initialArray);

        System.out.println("min = " + min);
    }

    public static int readInteger() {
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static int[] readElements(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
