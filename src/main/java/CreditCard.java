public class CreditCard {

    String type;
//    double interest;
    int balance;
    double interestPayment;

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

    public double getInterestPayment () {
        double interest = 0;

        if (type.equals("DISCOVER")) {
            interest = .01;
        } if (type.equals("MASTERCARD")) {
            interest = .05;
        } else {
            interest = .10;
        }

        interestPayment = balance * interest;
        return interestPayment;
    }


}





