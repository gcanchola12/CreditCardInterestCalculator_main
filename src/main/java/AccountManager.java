import java.util.ArrayList;

public class AccountManager {

    Customer customer;
    CreditCard creditCard;
    Wallet wallet;

    public void customerInfo(String name) {
        customer.setName(name);
    }

    public void creditCardInfo(float balance, float interest) {
        creditCard.setBalance(balance);
        creditCard.setInterest(interest);
    }

    public void createWallet(String walletName) {
        ArrayList<CreditCard> creditCards = new ArrayList<>();
        creditCards.add(creditCard);
        wallet.setCreditCards(creditCards);
        wallet.setWalletName(walletName);
    }

    public void startWalletCollection() {
        ArrayList<Wallet> wallets = new ArrayList<>();
        wallets.add(wallet);
        customer.setWallets(wallets);
    }

}
