package com.marceramirez;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        System.out.println("This customer already exists in " + this.name);
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = this.findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        System.out.println(customerName + " is not in branch " + this.getName());
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName()
                        .equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
