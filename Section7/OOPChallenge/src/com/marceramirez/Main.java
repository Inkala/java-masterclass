package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//		Hamburger myBurger = new Hamburger("Basic", "Sausage", 3.56, "White");
//		myBurger.addAddition1("Tomato", 0.27);
//		myBurger.addAddition2("Lettuce", 0.75);
//		myBurger.addAddition3("Cheese", 1.12);
//		System.out.println("Total price: " + myBurger.itemizeHamburger() + "€");
//		System.out.println("");
//
//		HealthyBurger healthyBurger = new HealthyBurger("Chicken", 3.89);
//		healthyBurger.addAddition1("Jalapenos", 0.73);
//		healthyBurger.addHealthyExtra1("Avocado", 1.36);
//		System.out.println("Total price: " + healthyBurger.itemizeHamburger() + "€");
//		System.out.println("");

		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.addAddition1("Jalapenos", 0.73);
		System.out.println("Total price: " + deluxeBurger.itemizeHamburger() + "€");
    }
}
