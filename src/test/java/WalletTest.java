import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    Wallet wallet;
    CreditCard discover;
    CreditCard mastercard;
    CreditCard visa;

    @Before
    public void setUp() throws Exception {
        wallet = new Wallet();
        discover = new CreditCard("discover", 100);
        mastercard = new CreditCard("mastercard", 100);
        visa = new CreditCard("visa", 100);

        wallet.addCreditCard(visa);
        wallet.addCreditCard(discover);
        wallet.addCreditCard(mastercard);

    }

    @Test
    public void canAddCreditCardToWallet() {
        assertEquals(3, wallet.getCreditCards().size());
    }

    @Test
    public void canGetTotalInterest() {
        assertEquals(16, wallet.getWalletTotalInterest(), 0);
    }
}