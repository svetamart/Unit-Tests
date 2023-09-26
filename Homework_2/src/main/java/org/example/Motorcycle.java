package org.example;

public class Motorcycle extends Vehicle{
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease, 2, 0);
    }

    @Override
    public void testDrive() {
        this.setSpeed(75);
    }

    @Override
    public void park() {
        this.setSpeed(0);
    }

    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        System.out.println("Company: " + getCompany());
        System.out.println("Model: " + getModel());
        System.out.println("Year of Release: " + getYearRelease());
        System.out.println("Number of Wheels: " + getNumWheels());
        System.out.println("Current Speed: " + getSpeed() + " km/h");
    }
}
