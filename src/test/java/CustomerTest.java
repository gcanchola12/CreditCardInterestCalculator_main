import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void ableToAddWallet() {
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Customer customer = new Customer();

        customer.addWallet(wallet1);
        customer.addWallet(wallet2);

        assertEquals(2, customer.getWallets().size() );
    }

    @Test
    public void testCase1() {
        Customer person1 = new Customer();
        Wallet wallet = new Wallet();
        CreditCard visa = new CreditCard("visa", 100);
        CreditCard discover = new CreditCard("discover", 100);
        CreditCard mastercard = new CreditCard("MasterCard", 100);

        wallet.addCreditCard(visa);
        wallet.addCreditCard(discover);
        wallet.addCreditCard(mastercard);
        person1.addWallet(wallet);

        assertEquals(10, visa.getInterestPayment(), 0);
        assertEquals(1, discover.getInterestPayment(),0);
        assertEquals(5, mastercard.getInterestPayment(), 0);
        assertEquals(16, person1.getWalletsTotalInterest(), 0);
    }
}