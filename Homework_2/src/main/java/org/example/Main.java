package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X1", 2022);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB1000R", 2018);

        car.displayInfo();
        System.out.println();
        motorcycle.displayInfo();

    }
}