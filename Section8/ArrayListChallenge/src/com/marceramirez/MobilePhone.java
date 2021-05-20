package com.marceramirez;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner sc;
    private ArrayList<Contact> contactList;

    public MobilePhone(Scanner sc) {
        this.sc = sc;
        this.contactList = new ArrayList<>();
    }

    public void printMenu() {
        System.out.println("Phone Menu");
        System.out.println("\t1 - Add new contact");
        System.out.println("\t2 - Update existing contact");
        System.out.println("\t3 - Remove contact");
        System.out.println("\t4 - Search contact");
        System.out.println("\t5 - Print list of contacts");
        System.out.println("\t0 - Quit");
    }

    public void addContact() {
        System.out.print("Name: ");
        String contactName = sc.nextLine();
        Contact foundContact = findContact(contactName);
        if (foundContact == null) {
            System.out.print("Phone Number: ");
            String phoneNumber = sc.nextLine();
            Contact newContact = new Contact(contactName, phoneNumber);
            contactList.add(newContact);
            System.out.println(contactName + " added");
        } else {
            System.out.println("This name already exists.");
        }
    }

    public void updateContact() {
        System.out.println("Enter contact name to update: ");
        String contactName = sc.nextLine();
        Contact foundContact = findContact(contactName);
        if (foundContact != null) {
            System.out.println("Select an option:");
            System.out.println("\t1 - Update contact's name ");
            System.out.println("\t2 - Update phone number ");
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("Enter new name");
                String newName = sc.nextLine();
                Contact existingContact = findContact(newName);
                if (existingContact != null) {
                    System.out.println("This name is already taken.");
                } else {
                    foundContact.setName(newName);
                    System.out.println(newName + " updated successfully.");
                }
            }
            if (option == 2) {
                System.out.println("Enter new phone number");
                String newPhone = sc.nextLine();
                foundContact.setPhoneNumber(newPhone);
                System.out.println(foundContact.getName() + " updated successfully");
            }
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact() {
        System.out.println("Enter contact name to delete: ");
        String contactName = sc.nextLine();
        Contact foundContact = findContact(contactName);
        if (foundContact != null) {
            contactList.remove(foundContact);
            System.out.println(contactName + " removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact() {
        System.out.println("Enter contact name to find: ");
        String contactName = sc.nextLine();
        Contact foundContact = findContact(contactName);
        if (foundContact != null) {
            System.out.println("Name: " + foundContact.getName());
            System.out.println("Phone: " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private Contact findContact(String contactName) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }
}

// When adding or updating be sure to check if the contact already exists (use name)