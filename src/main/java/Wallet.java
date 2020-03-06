import java.util.ArrayList;

public class Wallet {

    ArrayList<CreditCard> creditCards = new ArrayList<>();
    String walletName;
    float sumOfInterest;

    public Wallet(ArrayList<CreditCard> creditCards, String walletName, float sumOfInterest) {
        this.creditCards = creditCards;
        this.walletName = walletName;
        this.sumOfInterest = sumOfInterest;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public float getSumOfInterest() {
        Calculator calculator = new Calculator();
        sumOfInterest = 0;

        for (CreditCard creditCard : creditCards) {
            sumOfInterest += creditCard.getInterestAmount();
        }

        return sumOfInterest;
    }
}
