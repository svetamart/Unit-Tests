import static org.junit.jupiter.api.Assertions.*;

import org.example.Car;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Vehicle car = new Car("Ford", "Mustang", 1984);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testCarAcceleratesTo60() {
        Vehicle car = new Car("Chevrolet", "Camaro", 2009);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testCarStopsWhenParked() {
        Car car = new Car("Tesla", "Model S", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
