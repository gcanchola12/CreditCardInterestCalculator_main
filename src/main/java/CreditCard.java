public class CreditCard {

    float interest;
    float balance;
    float interestAmount;
    String creditCardType;

    public CreditCard(float interest, float balance, float interestAmount, String creditCardType) {
        this.interest = interest;
        this.balance = balance;
        this.interestAmount = interestAmount;
        this.creditCardType = creditCardType;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInterestAmount() {
        Calculator calculator = new Calculator();
        interestAmount = calculator.calculate(getBalance(), getInterest());
        return interestAmount;
    }

    public String getCreditCardType() {
        if (getInterest() == .01) {
            creditCardType = "Discover";
        } if (getInterest() == .05) {
            creditCardType = "MasterCard";
        } if (getInterest() == .10) {
            creditCardType = "Visa";
        }

        return creditCardType;
    }

}
