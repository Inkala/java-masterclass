package com.marceramirez;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Please enter a valid option.");
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addItem();
                    groceryList.printGroceryList();
                    break;
                case 3:
                    modifyItem();
                    groceryList.printGroceryList();
                    break;
                case 4:
                    removeItem();
                    groceryList.printGroceryList();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    groceryList.printGroceryList();
                    break;
                case 7:
                    System.out.println("Bye!");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nSelect one");
        System.out.println("\t 1 - To print choice options.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To print the list of grocery items.");
        System.out.println("\t 7 - To quit the application.");
    }

    private static void addItem() {
        System.out.println("Please enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter item to modify: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter modified item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item to delete: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    private static void searchForItem() {
        System.out.print("Enter item to find: ");
        String searchItem = scanner.nextLine();
        int position = groceryList.findItem(searchItem);
        if (position >= 0) {
            System.out.println("Found " + searchItem + " in your grocery list in the position " + position + 1);
        } else {
            System.out.println(searchItem + " is not in your grocery list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
