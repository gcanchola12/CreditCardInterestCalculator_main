package Models;

import java.util.ArrayList;

//checking to see if I should do this all on one page... bad idea.

public class creditCard {
    String customer;
    String creditCardType;
    float balance;
    float interest;
    ArrayList<String> wallet;
    ArrayList<String> wallets;

    public creditCard(String customer, String creditCardType, float balance, float interest, ArrayList<String> wallet, ArrayList<String> wallets) {
        this.customer = customer;
        this.creditCardType = creditCardType;
        this.balance = balance;
        this.interest = interest;
        this.wallet = wallet;
        this.wallets = wallets;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public String identifyCreditCardType(){
        if (getInterest() ==  1) {
            creditCardType = "Discover";
        }
        return creditCardType;
    }
}
