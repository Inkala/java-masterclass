package com.marceramirez;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 54.96);
        Customer customer2;

        customer2 = customer1;
        customer2.setBalance(12.18);;

        System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        System.out.println("");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("");
        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}

