import org.example.NumberInInterval;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberInIntervalTest {

    private NumberInInterval number;

    @BeforeEach
    public void setUp() {
        number = new NumberInInterval();  // Создаем экземпляр класса перед тестом
    }

    @Test
    public void testNumberInInterval() {

        // Проверяем, что число 50 попадает в интервал (25; 100)
        assertTrue(number.numberInInterval(50));

        // Проверяем, что число 26 попадает в интервал (25; 100)
        assertTrue(number.numberInInterval(26));

        // Проверяем, что число 99 попадает в интервал (25; 100)
        assertTrue(number.numberInInterval(99));

        // Проверяем, что число 25 не попадает в интервал (25; 100) (граничное значение)
        assertFalse(number.numberInInterval(25));

        // Проверяем, что число 100 не попадает в интервал (25; 100) (граничное значение)
        assertFalse(number.numberInInterval(100));

        // Проверяем, что число 24 не попадает в интервал (25; 100) (меньше минимального)
        assertFalse(number.numberInInterval(24));

        // Проверяем, что число 101 не попадает в интервал (25; 100) (больше максимального)
        assertFalse(number.numberInInterval(101));
    }
}
