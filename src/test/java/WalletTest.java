import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void canAddCreditCardToWallet() {
        Wallet wallet = new Wallet();
        CreditCard visa = new CreditCard("visa", 100);
        CreditCard discover = new CreditCard("discover", 100);
        CreditCard mastercard = new CreditCard("MasterCard", 100);

        wallet.addCreditCard(visa);
        wallet.addCreditCard(discover);
        wallet.addCreditCard(mastercard);

        assertEquals(3, wallet.getCreditCards().size());
    }

    @Test
    public void canGetTotalInterest() {
        Wallet wallet = new Wallet();
        CreditCard visa = new CreditCard("visa", 100);
        CreditCard discover = new CreditCard("discover", 100);
        CreditCard mastercard = new CreditCard("MasterCard", 100);

        wallet.addCreditCard(visa);
        wallet.addCreditCard(discover);
        wallet.addCreditCard(mastercard);

        assertEquals(16, wallet.getWalletTotalInterest(), 0);
    }
}