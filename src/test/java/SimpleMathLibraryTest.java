import org.example.SimpleMathLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {
    //Працють
    @Test
    public void testAdd() {
        double result = SimpleMathLibrary.add(2.0, 3.0);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testMinus() {
        double result = SimpleMathLibrary.minus(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }

    //Не працють
    @Test
    public void testAddSecond() {
        double result = SimpleMathLibrary.add(2.2, 3.4);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void testMinusSecond() {
        double result = SimpleMathLibrary.minus(5.2, 3.6);
        Assertions.assertEquals(2.7, result);
    }
}

