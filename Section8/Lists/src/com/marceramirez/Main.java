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

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }

        }
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\r0 - Print menu");
        System.out.println("\r1 - List of grocery items");
        System.out.println("\r2 - Add new item");
        System.out.println("\r3 - Modify item");
        System.out.println("\r4 - Remove item");
        System.out.println("\r5 - Search item");
        System.out.println("\r6 - Process list");
        System.out.println("\r7 - Quit");
    }


    private static void addItem() {
        System.out.print("Please enter the item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        System.out.print("Enter modified item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    private static void searchForItem() {
        System.out.println("Enter item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
