package com.marceramirez;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Staring phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println(
            "1 - to print contacts\n" +
            "2 - to add a new contact\n" +
            "3 - to update an existing contact\n" +
            "4 - to to remove a contact\n" +
            "5 - to query if an existing contact exists\n" +
            "6 - to to print list of available actions\n" +
            "0 - to shutdown\n"
        );
        System.out.println("Choose your action: ");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(contact)) {
            System.out.println(name + " added");
        } else {
            System.out.println("Can't add " + name + ". Name already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact contactToEdit = mobilePhone.queryContact(name);
        if (contactToEdit == null) {
            System.out.println("Contact not on file.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        Contact updatedContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(contactToEdit, updatedContact)) {
            System.out.println("Contact updated.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact contactToRemove = mobilePhone.queryContact(name);
        if (contactToRemove == null) {
            System.out.println("Contact not on file.");
            return;
        }
        if (mobilePhone.removeContact(contactToRemove)) {
            System.out.println("Contact removed.");
        } else {
            System.out.println("Error removing record.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact not on file.");
            return;
        }
        System.out.println("Name: " + contact.getName() + "\nPhone number: " + contact.getPhoneNumber());
    }

}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.