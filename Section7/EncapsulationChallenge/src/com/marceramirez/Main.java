package com.marceramirez;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted + " pages printed. New page count is " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(7);
        System.out.println(pagesPrinted + " pages printed. New page count is " + printer.getPagesPrinted());
    }
}
