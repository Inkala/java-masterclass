package com.marceramirez;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer != null) {
            foundCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if(customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
