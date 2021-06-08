package com.marceramirez;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i - 1] < sortedArray[i]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return sortedArray;
    }
}
