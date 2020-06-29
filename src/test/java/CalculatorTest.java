import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator underTest = new Calculator();

    @Test
    public void runOperation_add() throws Exception {
        assertEquals(6, underTest.runOperation(3, 3, '+'));
    }

    @Test
    public void runOperation_subtract() throws Exception {
        assertEquals(0, underTest.runOperation(3, 3, '-'));
    }

    @Test
    public void runOperation_multiply() throws Exception {
        assertEquals(9, underTest.runOperation(3, 3, '*'));
    }

    @Test
    public void runOperation_divide() throws Exception {
        assertEquals(8, underTest.runOperation(16, 2, '/'));
    }

    @Test
    public void runOperation_invalidOperand() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            underTest.runOperation(3, 3, 'c');
        });

        String expectedMessage = "ERROR:Invalid operation! Try running the program again.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getTotal() throws Exception{
        underTest.runOperation(underTest.runOperation(3, 4, '+'), 8.5, '-');
        assertEquals(-1.5, underTest.getTotal());
    }

    @Test
    public void clearCalculator() throws Exception {
        assertEquals(0, underTest.clearCalculator());
    }

}