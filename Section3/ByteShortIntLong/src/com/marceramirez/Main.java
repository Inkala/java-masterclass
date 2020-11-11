package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//        int myValue = 10000;
//        int myMaxIntTest = 2_147_483_647;
//
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMinIntValue);
//        System.out.println("Integer Maximum Value = " + myMaxIntValue);
//        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
//        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
//
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimum Value = " + myMinByteValue);
//        System.out.println("Byte Maximum Value = " + myMaxByteValue);
//
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Minimum Value = " + myMinShortValue);
//        System.out.println("Short Maximum Value = " + myMaxShortValue);
//
//        long myLongValue = 100L;
//        long myMaxLongTest = 9_223_372_036_854_775_807L;
//
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Minimum Value = " + myMinLongValue);
//        System.out.println("Long Maximum Value = " + myMaxLongValue);
//
//        int myTotal = (myMinIntValue / 2);
//        //--> Casting <--//
//        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        short myNewShortValue = (short) (myMinShortValue / 2);

        byte theByte = 10;
        short theShort = 20;
        int theInt = 50;

        long longTotal = 50000L + 10L * (theByte + theShort + theInt);
        System.out.println("The Long:" + longTotal);
        short shortTotal = (short) (1000 + 10 * (theByte + theShort + theInt));
        System.out.println("The Short:" + shortTotal);

    }
}
