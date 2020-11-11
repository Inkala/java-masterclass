package com.marceramirez;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "20.18";

        double number = Double.parseDouble(numberAsString);

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 0.5;
        number += 0.5;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);
    }
}
