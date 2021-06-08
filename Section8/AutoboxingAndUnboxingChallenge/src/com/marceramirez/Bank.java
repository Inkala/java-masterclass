package com.marceramirez;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        System.out.println("This branch already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            return foundBranch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Branch " + branchName + " doesn't exist");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addCustomerTransaction(customerName, amount);
        }
        System.out.println("Branch " + branchName + " doesn't exist");
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName()
                      .equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean shouldPrintTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());
            ArrayList<Customer> customers = existingBranch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (shouldPrintTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}


