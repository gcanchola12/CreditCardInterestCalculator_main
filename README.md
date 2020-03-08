# Credit Card Interest Calculator

A calculator built using Java for calculating simple credit card interest. 

## About the program

The user or 'customer' enters a credit card into a wallet and stores the wallet in her own wallet. The customer can only enter a Discover, MasterCard or Visa. The program automatically converts the type of credit card string to uppercase to facilitate comparison and throws an exception when the customer enteres a different value not allowed.  

```java
Customer customer = new Customer();
Wallet wallet = new Wallet();
CreditCard creditCard = new CreditCard("Visa", 100);
wallet.addCreditCard(creditCard);
customer.addWallet(wallet);
```

A Discover card has an interest of .01, MasterCard .05, and Visa .10. The user is able to calculate the interest by card, by wallet or customer.

```java
creditCard.getInterestPayment();
wallet.getTotalWalletInterest();
customer.getTotalWalletsInterest();
```

## Testing

There are four test cases. 

Test Case 1 
```
Person 1 has 1 wallet with one of each of the cards. 
```
Test Case 2
```
Person 1 has 1 wallet with two cards.
```
Test Case 3 
```
Person 1 has 1 wallet with one of each of the cards and person 2 has 1 wallet with 2 cards. 
```
Each case tests the interest per person, per wallet and/or per card. 

## SOLID Principles

Single Responsiblity:

Open-closed principle:

Liskov substitution principle:

Interface segregation principle:

Dependency Inversion Principle:
