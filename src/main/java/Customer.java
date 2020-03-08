import java.util.ArrayList;

public class Customer {

    ArrayList<Wallet> wallets = new ArrayList<>();

    public Customer() {
    }

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    public double getWalletsTotalInterest() {
        double total = 0;

        for (Wallet wallet : wallets) {
            Calculator calculator = new Calculator();
            total += calculator.calculateWalletInterest(wallet.getCreditCards());
        }
        return  total;
    }
}
