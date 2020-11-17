package com.marceramirez;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine();";
    }

    public String accelerate() {
        return "Car -> accelerate();";
    }

    public String brake() {
        return "Car -> brake();";
    }
}

class Renault extends Car {
    public Renault(int cylinders) {
        super("Renault", cylinders);
    }

    @Override
    public String startEngine() {
        return "Renault -> startEngine();";
    }
}
class Chevrolet extends Car {
    public Chevrolet(int cylinders) {
        super("Chevrolet", cylinders);
    }

    @Override
    public String accelerate() {
        return "Chevrolet -> accelerate();)";
    }

    @Override
    public String brake() {
        return "Chevrolet -> brake();";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("");

        Chevrolet chevy = new Chevrolet(10);
        System.out.println(chevy.startEngine());
        System.out.println(chevy.accelerate());
        System.out.println(chevy.brake());
        System.out.println("");

        Renault renault = new Renault(12);
        System.out.println(renault.startEngine());
        System.out.println(renault.accelerate());
        System.out.println(renault.brake());
    }
}
