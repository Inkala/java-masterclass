package com.marceramirez;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int bigBags = 0;
        for (int i = 1; i <= bigCount; i++) {
            if (i * 5 == goal) return true;
            if (i * 5 > goal) break;
            bigBags++;
        }
        int newGoal = goal - (5 * bigBags);
        for (int i = 1; i <= smallCount; i++) {
            if (i == newGoal) return true;
        }
        return false;
    }
}