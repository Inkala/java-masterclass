package com.marceramirez;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Resolution nativeResolution = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution);

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
