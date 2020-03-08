import java.util.ArrayList;

public class Calculator {

    public double calculateInterest(String creditCardType, int balance ) {
        double rate = 0;
        if (creditCardType.equals("DISCOVER")) {
            rate = .01;
        } if (creditCardType.equals("MASTERCARD")) {
            rate = .05;
        } if (creditCardType.equals("VISA")) {
            rate = .10;
        }

        return rate * balance;
    }

    public double calculateWalletInterest(ArrayList<CreditCard> creditCards) {
        double walletTotal = 0;
        for (CreditCard creditCard : creditCards) {
            walletTotal += creditCard.getInterestPayment();
        }

        return walletTotal;
    }

}
