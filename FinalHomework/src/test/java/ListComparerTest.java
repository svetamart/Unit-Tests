import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListComparerTest {

    private ListComparer listComparer;

    @Test
    public void testCompareListsDifferentAverages() {
        // Создаем два списка с числами
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        // Создаем экземпляр ListComparer с передачей списков в конструктор
        listComparer = new ListComparer(list1, list2);

        // Вызываем метод compareLists
        String result = listComparer.compareLists();

        // Проверяем, что результат соответствует ожидаемому
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareListsEqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(5, 4, 3, 2, 1);

        listComparer = new ListComparer(list1, list2);

        String result = listComparer.compareLists();

        assertEquals("Средние значения равны", result);
    }
}






