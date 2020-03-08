import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;
    CreditCard discover;
    CreditCard mastercard;
    CreditCard visa;
    Wallet wallet1;
    Wallet wallet2;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
        discover = new CreditCard("discover", 100);
        mastercard = new CreditCard("mastercard", 100);
        visa = new CreditCard("visa", 100);

        wallet1 = new Wallet();
        wallet2 = new Wallet();
    }

    @Test
    public void calculateInterest() {
        assertEquals(10, calculator.calculateInterest("VISA", 100), 0);
    }

    @Test
    public void calculateWalletInterest() {
        wallet1.addCreditCard(visa);
        wallet1.addCreditCard(discover);

        wallet2.addCreditCard(mastercard);
        wallet2.addCreditCard(visa);

        assertEquals(26, calculator.calculateWalletInterest(wallet1.getCreditCards()) +
                calculator.calculateWalletInterest(wallet2.getCreditCards()),0);
    }
}