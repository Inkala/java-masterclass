package com.marceramirez;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int fillToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (tonerLevel + amount > 100) {
                return -1;
            } else {
                tonerLevel += amount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint;
        if (isDuplex) {
            System.out.println("Printer in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        } else {
            pagesToPrint = pages;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
