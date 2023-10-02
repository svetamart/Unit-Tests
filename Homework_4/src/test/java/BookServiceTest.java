import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

class BookServiceTest {
    private BookRepository mockRepository;
    private BookService bookService;

    @BeforeAll
    public void setUp() {
        // Создаем мок объект BookRepository
        mockRepository = mock(BookRepository.class);

        // Передаем мок-объект в BookService
        bookService = new BookService(mockRepository);
    }

    @Test
    public void testFindBookById() {
        // Задаем поведение мок-объекта при вызове метода findById
        when(mockRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        // Вызываем метод findBookById
        Book result = bookService.findBookById("1");

        // Проверяем, что результат соответствует ожидаемому
        assertEquals("1", result.getId());
        assertEquals("Book1", result.getTitle());
        assertEquals("Author1", result.getAuthor());

        // Проверяем, что метод findById был вызван с правильным аргументом
        verify(mockRepository, times(1)).findById("1");
    }

    @Test
    public void testFindAllBooks() {
        // Задаем поведение мок-объекта при вызове метода findAll
        when(mockRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ));

        // Вызываем метод findAllBooks
        List<Book> result = bookService.findAllBooks();

        // Проверяем, что результат соответствует ожидаемому
        assertEquals(2, result.size());

        // Проверяем, что метод findAll был вызван
        verify(mockRepository, times(1)).findAll();
    }
}