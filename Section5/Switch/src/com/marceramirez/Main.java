package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Neither 1 or 2");
//        }

//        int switchValue = 6;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value is 1");
//                break;
//            case 2:
//                System.out.println("Value is 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value is 3, or 4, or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Value is higher than 5");
//                break;
//        }

//        Challenge
        char switchChar = 'D';
        switch (switchChar) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':case 'D':case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("Wasn't A, B, C, D or E.");
        }
    }
}
