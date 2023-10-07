import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCalculatorTest {
    @Test
    public void testCalculateAverageWithEmptyList() {
        // Тест на случай, когда список пуст
        List<Integer> numbers = Arrays.asList();

        // Вызываем метод calculateAverage
        double result = AverageCalculator.calculateAverage(numbers);

        // Проверяем, что результат равен 0.0
        assertEquals(0.0, result);
    }

    @Test
    public void testCalculateAverageWithNonEmptyList() {
        // Тест на случай, когда список не пуст
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Вызываем метод calculateAverage
        double result = AverageCalculator.calculateAverage(numbers);

        // Проверяем, что результат равен среднему значению (3.0)
        assertEquals(3.0, result);
    }
}
