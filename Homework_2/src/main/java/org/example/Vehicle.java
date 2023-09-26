package org.example;

// ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

public abstract class Vehicle {

    protected String company;

    protected String model;

    protected int yearRelease;

    protected int numWheels;

    protected double speed;

    public Vehicle(String company, String model, int yearRelease, int numWheels, double speed) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;
        this.speed = speed;
    }

    public abstract void testDrive();
    public abstract void park();

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getCompany() {
        return company;
    }


    public String getModel() {
        return model;
    }


    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }
}

