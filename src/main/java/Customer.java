import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Wallet> wallets = new ArrayList<>();

    public Customer(String name, ArrayList<Wallet> wallets) {
        this.name = name;
        this.wallets = wallets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(ArrayList<Wallet> wallets) {
        this.wallets = wallets;
    }
}
