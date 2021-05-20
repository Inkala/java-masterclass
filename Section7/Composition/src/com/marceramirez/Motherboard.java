package com.marceramirez;

public class Motherboard {

    private String model;

    private String manufacturer;
    private int ramSlots;
    private int carSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int carSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is loading...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public void setCarSlots(int carSlots) {
        this.carSlots = carSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
