import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testCases {

    CreditCard discover;
    CreditCard mastercard;
    CreditCard visa;
    Wallet wallet1;
    Wallet wallet2;
    Customer person1;
    Customer person2;

    @Before
    public void setUp() throws Exception {
        discover = new CreditCard("discover", 100);
        mastercard = new CreditCard("mastercard", 100);
        visa = new CreditCard("visa", 100);

        wallet1 = new Wallet();
        wallet2 = new Wallet();

        person1 = new Customer();
        person2 = new Customer();

        person1.addWallet(wallet1);
    }

    @Test
    public void testCase1() {
        wallet1.addCreditCard(mastercard);
        wallet1.addCreditCard(discover);
        wallet1.addCreditCard(visa);

        assertEquals(5, mastercard.getInterestPayment(), 0);
        assertEquals(1, discover.getInterestPayment(), 0);
        assertEquals(10, visa.getInterestPayment(), 0);

        assertEquals(16, person1.getWalletsTotalInterest(), 0);
    }

    @Test
    public void testCase2() {
        wallet1.addCreditCard(visa);
        wallet1.addCreditCard(discover);

        wallet2.addCreditCard(mastercard);

        person1.addWallet(wallet2);

        assertEquals(11, wallet1.getWalletTotalInterest(), 0);
        assertEquals(5, wallet2.getWalletTotalInterest(), 0);

        assertEquals(16, person1.getWalletsTotalInterest(),0);
    }

    @Test
    public void testCase3() {
        wallet1.addCreditCard(mastercard);
        wallet1.addCreditCard(visa);
        wallet1.addCreditCard(discover);

        Wallet otherWallet1 = new Wallet();
        otherWallet1.addCreditCard(visa);
        otherWallet1.addCreditCard(mastercard);

        person2.addWallet(otherWallet1);

        assertEquals(16, person1.getWalletsTotalInterest(),0);
        assertEquals(15, person2.getWalletsTotalInterest(),0);

        assertEquals(16, wallet1.getWalletTotalInterest(),0);
        assertEquals(15, otherWallet1.getWalletTotalInterest(),0);
    }
}