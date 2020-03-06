import java.util.ArrayList;

public class Customer {

    ArrayList<Wallet> wallets;

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }

    public double totalWalletsInterest() {
        double totalWalletInterest = 0;
        for (Wallet wallet : wallets) {
            totalWalletInterest += wallet.getWalletInterestTotal();
        }

        return totalWalletInterest;
    }


}
