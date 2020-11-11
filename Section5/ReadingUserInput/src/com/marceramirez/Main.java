package com.marceramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean isInputInt = scanner.hasNextInt();
        if (isInputInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int age = 2020 - yearOfBirth;

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
            scanner.close();
        } else {
            System.out.println("Please enter a valid number");
        }
    }
}
