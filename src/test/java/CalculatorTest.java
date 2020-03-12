import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateInterest() {
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.calculateInterest("VISA", 100), 0);
    }
}