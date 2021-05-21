package com.marceramirez;

public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        double price = hamburger.itemizedHamburger();
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        price = hamburger.itemizedHamburger();
//        System.out.println("Total price: " + price + "€");

//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthAddition1("Kale", 3.41);
//        System.out.println("Total price: " + healthyBurger.itemizedHamburger() + "€");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Test", 1);
        System.out.println("Total price: " + deluxeBurger.itemizedHamburger() + "€");
    }
}
