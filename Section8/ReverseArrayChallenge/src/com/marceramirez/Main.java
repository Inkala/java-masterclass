package com.marceramirez;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println("Before: " + Arrays.toString(test));
        reverse(test);
        System.out.println("After: " + Arrays.toString(test));
    }

    public static void reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            int last = array.length - i - 1;
            temp = array[i];
            array[i] = array[last];
            array[last] = temp;
        }
    }
}
