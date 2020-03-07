public class CreditCard {

    String type;
    double interest;
    int balance;
    double interestPayment;

    public CreditCard(String type, int balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws Exception {
        type.toUpperCase();
        if (!type.equals("DISCOVER") || !type.equals("MASTERCARD") || !type.equals("")) {
            throw new Exception("Only Discover, MasterCard or Visa are allowed");
        }
        this.type = type;
    }

    public double getInterest() {
        if (getType() == "DISCOVER") {
            interest = .01;
        } if (getType() == "MASTERCARD") {
            interest = .05;
        } if (getType() == "VISA") {
            interest = .10;
        }

        return interest;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestPayment() throws Exception {
        Calculator calculator = new Calculator();
        interestPayment = calculator.calculate(getBalance(), getInterest());
        return interestPayment;
    }
}


