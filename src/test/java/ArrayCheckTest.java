import org.example.ArrayCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCheckTest {
    //Працюють бо були вказані правильні відповіді в тестах в першому та в другому
    //В першому правильні та він видає assertTrue
    @Test
    void testCheckArrayPositive() {
        int[] arr1 = {1, 4, 1, 4, 4, 1};
        int[] arr2 = {4, 1, 1, 1, 4, 4, 4};
        int[] arr3 = {1, 1, 1, 4, 4, 4};
        int[] arr4 = {1, 4, 4, 1, 1, 4};


        Assertions.assertTrue(ArrayCheck.checkArray(arr1));
        Assertions.assertTrue(ArrayCheck.checkArray(arr2));
        Assertions.assertTrue(ArrayCheck.checkArray(arr3));
        Assertions.assertTrue(ArrayCheck.checkArray(arr4));
    }

    //В другому правильні та він видає assertFalse
    @Test
    void testCheckArrayNegative() {
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {4, 4, 4};
        int[] arr3 = {1, 4, 4, 1, 1, 3};
        int[] arr4 = {};

        Assertions.assertFalse(ArrayCheck.checkArray(arr1));
        Assertions.assertFalse(ArrayCheck.checkArray(arr2));
        Assertions.assertFalse(ArrayCheck.checkArray(arr3));
        Assertions.assertFalse(ArrayCheck.checkArray(arr4));
    }

    //Не працюють по не вказані правильні assertTrue та assertFalse
    //В першому не працює в arr2 бо там в кінці стоїть 2 та вказано assertTrue
    @Test
    void testCheckArrayPositiveTwo() {
        int[] arr1 = {1, 4, 1, 4, 4, 1};
        int[] arr2 = {4, 1, 1, 1, 4, 4, 4, 2};
        int[] arr3 = {1, 1, 1, 4, 4, 4};
        int[] arr4 = {1, 4, 4, 1, 1, 4};


        Assertions.assertTrue(ArrayCheck.checkArray(arr1));
        Assertions.assertTrue(ArrayCheck.checkArray(arr2));
        Assertions.assertTrue(ArrayCheck.checkArray(arr3));
        Assertions.assertTrue(ArrayCheck.checkArray(arr4));
    }
    //В другому не працює в arr1 бо там все правильно але вказано, що потрібно вивести assertFalse
    @Test
    void testCheckArrayNegativeTwo() {
        int[] arr1 = {1, 1, 1, 1, 4};
        int[] arr2 = {4, 4, 4};
        int[] arr3 = {1, 4, 4, 1, 1, 3};
        int[] arr4 = {};

        Assertions.assertFalse(ArrayCheck.checkArray(arr1));
        Assertions.assertFalse(ArrayCheck.checkArray(arr2));
        Assertions.assertFalse(ArrayCheck.checkArray(arr3));
        Assertions.assertFalse(ArrayCheck.checkArray(arr4));
    }
}

