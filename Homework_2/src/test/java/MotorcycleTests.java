import static org.junit.jupiter.api.Assertions.*;

import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;
public class MotorcycleTests {

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019);
        assertTrue(motorcycle instanceof Vehicle);
    }
    @Test
    public void testMotorcycleHasTwoWheels() {
        Vehicle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testMotorcycleAcceleratesTo75() {
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Monster", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}
