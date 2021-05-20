package com.marceramirez;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        return (int) (n1 * 1000) == (int) (n2 * 1000);
    }
}
