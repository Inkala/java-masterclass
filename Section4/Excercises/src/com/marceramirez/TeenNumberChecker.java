package com.marceramirez;

public class TeenNumberChecker {

    public static boolean hasTeen(int n1, int n2, int n3) {
        return isTeen(n1) || isTeen(n2) || isTeen(n3);
    }

    public static boolean isTeen(int n) {
        return n > 12 && n < 20;
    }
}
