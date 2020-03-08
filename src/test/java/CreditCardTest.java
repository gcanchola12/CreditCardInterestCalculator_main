import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test(expected = IllegalArgumentException.class)
    public void typeNotCorrect() throws IllegalArgumentException {
        CreditCard creditCard = new CreditCard("Barclay", 100 );

        assertEquals("MASTERCARD", creditCard.getType());
    }

    @Test
    public void correctTypeEntered() throws IllegalArgumentException{
        CreditCard creditCard = new CreditCard("Discover", 100 );

        assertEquals("DISCOVER", creditCard.getType() );
    }

    @Test
    public void getInterestPayment() {
        CreditCard creditCard = new CreditCard("MasterCard", 100);

        assertEquals(5, creditCard.getInterestPayment(), 0.01);
    }
}