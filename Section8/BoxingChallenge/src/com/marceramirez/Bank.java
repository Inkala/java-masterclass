package com.marceramirez;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if(branch.getName().equals(branchName)) {
                return  branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> customerList = branch.getCustomers();
            for (Customer customer : customerList) {
                System.out.println("Customer: " + customer.getName());
                if (showTransactions) {
                    int transactionNumber = 0;
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (Double transaction : transactions) {
                        transactionNumber++;
                        System.out.println("  # " + transactionNumber + " - " + transaction + " €");
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
