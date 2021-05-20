package com.marceramirez;

public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if (
            n1 < 10 ||
                n2 < 10 ||
                n1 > 99 ||
                n2 > 99
        ) return false;
        if (
            n1 / 10 == n2 / 10 ||
                n1 / 10 == n2 % 10 ||
                n1 % 10 == n2 / 10 ||
                n1 % 10 == n2 % 10
        ) return true;
        return false;
    }
}
