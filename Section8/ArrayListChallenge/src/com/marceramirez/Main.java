package com.marceramirez;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean phoneActive = true;
        MobilePhone phone = new MobilePhone(sc);
        phone.printMenu();
        int option;
        while (phoneActive) {
            System.out.println("\nSelect an option: ");
            if (sc.hasNextInt()) {
                option = sc.nextInt();
            } else {
                option = 0;
            }
            sc.nextLine();
            switch (option) {
                case 1:
                    phone.addContact();
                    break;
                case 2:
                    phone.updateContact();
                    break;
                case 3:
                    phone.deleteContact();
                    break;
                case 4:
                    phone.searchContact();
                    break;
                case 5:
                    phone.printContacts();
                    break;
                case 0:
                    phoneActive = false;
                    break;
                default:
                    System.out.println("\nPlease select a valid option");
                    break;
            }
        }
    }
}
