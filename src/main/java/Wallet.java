import java.util.ArrayList;

public class Wallet {

    ArrayList<CreditCard> creditCards = new ArrayList<>();

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    public double getWalletTotalInterest() {
        Calculator calculator = new Calculator();
        return calculator.calculateWalletInterest(creditCards);
    }
}
