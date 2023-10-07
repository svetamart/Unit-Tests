import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ListGeneratorTest {
    @Test
    public void testGenerateRandomListNotNull() {
        List<Integer> randomList = ListGenerator.generateRandomList();

        // Проверяем, что список не null
        assertNotNull(randomList);
    }

    @Test
    public void testGenerateRandomListLengthInRange() {
        List<Integer> randomList = ListGenerator.generateRandomList();

        // Проверяем, что длина списка в диапазоне от 0 до 10
        assertTrue(randomList.size() >= 0 && randomList.size() <= 10);
    }

    @Test
    public void testGenerateRandomListNumbersInRange() {
        List<Integer> randomList = ListGenerator.generateRandomList();

        // Проверяем, что числа в списке в диапазоне от 0 до 99
        for (int number : randomList) {
            assertTrue(number >= 0 && number <= 99);
        }
    }

    @Test
    public void testPrintList() {
        List<Integer> testList = List.of(1, 2, 3, 4, 5);
        int listNumber = 1;

        // Перенаправляем стандартный вывод в ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Вызываем метод printList
        ListGenerator.printList(testList, listNumber);

        // Восстанавливаем стандартный вывод
        System.setOut(System.out);

        // Получаем строку из ByteArrayOutputStream
        String consoleOutput = outputStream.toString().trim();

        // Проверяем, что вывод в консоль соответствует ожидаемому формату
        assertEquals("Список " + listNumber + ": " + testList, consoleOutput);
    }
}