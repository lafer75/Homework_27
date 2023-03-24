import org.example.ArrayAfterLastFour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayAfterLastFourTest {
    //Працюють бо є 4, але якщоб не було в тестах не має що треба викинути exception
    @Test
    public void testExtractAfterLastFour1() {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectedResult = {1, 7};
        int[] result = ArrayAfterLastFour.extractAfterLastFour(inputArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testExtractAfterLastFour2() {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 4, 1, 7};
        int[] expectedResult = {1, 7};
        int[] result = ArrayAfterLastFour.extractAfterLastFour(inputArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testExtractAfterLastFour3() {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 5, 1, 7};
        int[] expectedResult = {2, 3, 5, 1, 7};
        int[] result = ArrayAfterLastFour.extractAfterLastFour(inputArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    //Не працюють бо є 4, але в тестах було вказано що треба викинути exception
    @Test
    public void testExtractAfterLastFour4() {
        int[] inputArray = {1, 2, 3, 5, 4, 1, 7};
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            ArrayAfterLastFour.extractAfterLastFour(inputArray);
        });
        String expectedMessage = "Массив не содержит четверки";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    //Не працюють бо не має 4, але не вказано що треба викинути exception
    @Test
    public void testExtractAfterLastFour5() {
        int[] inputArray = {1, 2, 2, 3, 5, 1, 7};
        int[] expectedResult = {2, 3, 5, 1, 7};
        int[] result = ArrayAfterLastFour.extractAfterLastFour(inputArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}

