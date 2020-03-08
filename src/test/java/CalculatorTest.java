import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateInterest() {
        Calculator calculator = new Calculator();

        double actual = calculator.calculateInterest("VISA", 100);


        assertEquals(10, actual, 0);
    }

    @Test
    public void calculateWalletInterest() {
    }
}