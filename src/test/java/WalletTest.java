import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {


    @Test
    public void addACreditCardToWallet() {
        CreditCard creditCard = new CreditCard("MasterCard", 100);
        CreditCard visa = new CreditCard("Visa", 100);
        Wallet wallet = new Wallet(creditCard);

        wallet.addCreditCard(creditCard);
        wallet.addCreditCard(visa);

        assertEquals("[MASTERCARD, VISA]", wallet.getCreditCards() );
    }

    @Test
    public void addCreditCard() {
    }

    @Test
    public void getWalletInterestTotal() {
    }
}