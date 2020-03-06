import java.util.ArrayList;

public class Wallet {

    CreditCard creditCard;
    ArrayList<CreditCard> creditCards = new ArrayList<>();

    public ArrayList getCreditCards() {
        return creditCards;
    }

    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    public double getWalletInterestTotal() {
        double walletInterestTotal = 0;

        for (CreditCard creditCard : creditCards) {
            walletInterestTotal += creditCard.interestPayment;
        }

        return  walletInterestTotal;
    }

}
