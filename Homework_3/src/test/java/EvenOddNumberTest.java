import org.example.EvenOddNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EvenOddNumberTest {

    private EvenOddNumber number;

    @BeforeEach
    public void setUp() {
        number = new EvenOddNumber();  // Создаем экземпляр класса перед тестом
    }

    @Test
    public void testEvenNumber() {
        // Проверяем, что метод evenOddNumber возвращает true для четных чисел
        assertTrue(number.evenOddNumber(2));
        assertTrue(number.evenOddNumber(10));
        assertTrue(number.evenOddNumber(100));
    }

    @Test
    public void testOddNumber() {
        // Проверяем, что метод evenOddNumber возвращает false для нечетных чисел
        assertFalse(number.evenOddNumber(3));
        assertFalse(number.evenOddNumber(11));
        assertFalse(number.evenOddNumber(101));
    }

    @Test
    public void testZero() {
        // Проверяем, что метод evenOddNumber возвращает true для нуля
        assertTrue(number.evenOddNumber(0));
    }

    @Test
    public void testNegativeNumber() {
        // Проверяем, что метод evenOddNumber возвращает true для отрицательных четных чисел
        assertTrue(number.evenOddNumber(-4));

        // Проверяем, что метод evenOddNumber возвращает false для отрицательных нечетных чисел
        assertFalse(number.evenOddNumber(-3));
    }
}
