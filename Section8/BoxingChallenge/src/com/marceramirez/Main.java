package com.marceramirez;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank ("National Australia Bank");

	    bank.addBranch("Adelaide");
	    bank.addCustomer("Adelaide", "Tim", 50.55);
	    bank.addCustomer("Adelaide", "Mike", 210.02);
	    bank.addCustomer("Adelaide", "Percy", 372);

	    bank.addBranch("Sydney");
	    bank.addCustomer("Sydney", "Bob", 76.49);

	    bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
	    bank.addCustomerTransaction("Adelaide", "Tim", 996.14);
	    bank.addCustomerTransaction("Adelaide", "Mike", 12.38);

	    bank.listCustomers("Adelaide", true);
    }
}