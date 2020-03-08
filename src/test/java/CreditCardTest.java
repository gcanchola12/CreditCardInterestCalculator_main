import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void setUp() throws Exception {
        creditCard = new CreditCard("discover", 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void typeNotCorrect() throws IllegalArgumentException {
        CreditCard creditCard = new CreditCard("Barclay", 100);

        assertEquals("MASTERCARD", creditCard.getType());
    }

    @Test
    public void correctTypeEntered() throws IllegalArgumentException{
        assertEquals("DISCOVER", creditCard.getType());
    }

    @Test
    public void getInterestPayment() {
        assertEquals(1, creditCard.getInterestPayment(), 0.01);
    }
}