import java.util.List;
/**
 * Класс для вычисления среднего значения списка целых чисел.
 */
public class AverageCalculator {

    /**
     * Вычисляет среднее значение списка целых чисел.
     *
     * @param numbers Список целых чисел.
     * @return Среднее значение чисел в списке или 0.0, если список пуст или равен null.
     */
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
