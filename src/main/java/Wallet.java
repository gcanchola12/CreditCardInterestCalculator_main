import java.util.ArrayList;

public class Wallet {

    CreditCard creditCard;
    ArrayList<CreditCard> creditCards = new ArrayList<>();

    public Wallet(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCards() {
        ArrayList<String> creditCardTypes = new ArrayList<>();

        for (CreditCard creditCard : creditCards) {
            creditCardTypes.add(creditCard.getType());
        }
        return creditCardTypes.toString();
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
