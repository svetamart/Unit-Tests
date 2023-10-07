import java.util.List;

/**
 * Класс для сравнения двух списков целых чисел по их средним значениям.
 */

public class ListComparer {
    private List<Integer> list1;
    private List<Integer> list2;

    /**
     * Конструктор класса ListComparer.
     *
     * @param list1 Первый список целых чисел.
     * @param list2 Второй список целых чисел.
     */
    public ListComparer(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    /**
     * Сравнивает средние значения двух списков целых чисел.
     *
     * @return Результат сравнения в виде строки.
     */

    public String compareLists() {
        double averageList1 = AverageCalculator.calculateAverage(list1);
        double averageList2 = AverageCalculator.calculateAverage(list2);

        String result;

        if (averageList1 > averageList2) {
            result = "Первый список имеет большее среднее значение";
        } else if (averageList1 < averageList2) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }

        return result;
    }
}
