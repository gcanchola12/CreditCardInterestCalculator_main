import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    CreditCard discover;
    CreditCard mastercard;
    CreditCard visa;
    Wallet wallet1;
    Wallet wallet2;
    Customer customer;


    @Before
    public void setUp() {
        discover = new CreditCard("discover", 100);
        mastercard = new CreditCard("mastercard", 100);
        visa = new CreditCard("visa", 100);

        wallet1 = new Wallet();
        wallet2 = new Wallet();

        customer = new Customer();

        customer.addWallet(wallet1);
        customer.addWallet(wallet2);
    }

    @Test
    public void ableToAddWallet() {
        assertEquals(2, customer.getWallets().size() );
    }

    @Test
    public void canGetTotalInterestOfWallets() {
        wallet1.addCreditCard(visa);
        wallet1.addCreditCard(discover);
        wallet2.addCreditCard(mastercard);

        assertEquals(16, customer.getWalletsTotalInterest(), 0);
    }
}