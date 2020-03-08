public class CreditCard {

    String type;
    int balance;

    //TODO shorten first if statement

    public CreditCard(String type, int balance) throws IllegalArgumentException {
        if ( ("DISCOVER".equals(type.toUpperCase())) || ("MASTERCARD".equals(type.toUpperCase())) || ("VISA".equals(type.toUpperCase())) ) {
            this.type = type.toUpperCase();
        } else {
            throw new IllegalArgumentException("Sorry, wallet only accepts Discover, MasterCard, Visa.");
        }

        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance ( int balance) {
        this.balance = balance;
    }

    public double getInterestPayment() {
        Calculator calculator = new Calculator();
        return calculator.calculateInterest(type, balance);
    }
}





