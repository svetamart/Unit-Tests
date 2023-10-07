import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс для генерации и вывода списков целых чисел.
 */
public class ListGenerator {
    private static Random random = new Random();

    /**
     * Генерирует список целых чисел.
     *
     * @return Список случайных целых чисел.
     */

    public static List<Integer> generateRandomList() {
        int length = random.nextInt(0,11); // Генерация случайной длины от 0 до 10
        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            randomList.add(random.nextInt(100)); // Генерация случайных чисел от 0 до 99
        }
        return randomList;
    }

    /**
     * Выводит список целых чисел в консоль.
     *
     * @param list       Список целых чисел.
     * @param listNumber Номер списка.
     */

    public static void printList(List<Integer> list, int listNumber) {
        System.out.println("Список " + listNumber + ": " + list);
    }
}
