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

In designing this program, I decided to take a real life approach because it was the best way of implementing the S.O.L.I.D principles. In reality, a customer will have a credit card, they enter that card in their wallet, and then they might store it with the rest of their wallets. Later, when a person wants to calculate how much money is going toward interest, they might take out their calculators and do some math. Similarily, this program contains 4 objects: 1 credit card, 1 wallet, 1 'person with more wallets' object. 

<b>Single Responsiblity</b> Each object has a single job. For example, rather than have each object handle its own calculations, it was more efficiant to have a single calculator class that handles the calculations for the rest of the classes. 

<b>Open-closed principle</b> Each object has its own method that calls upon the calculator object to find the interest of each credit card. The wallet and customer objects extend upon the calculator output by using it to calculate the sum of the wallet or wallets - all without making a single modification to the calculator object. 

<b>Liskov substitution principle</b> I considered creating an object for each type of credit card and have them inherent from a credit card class to more closely reflect how real life people use credit cards. After all, you don't have generic credit cards in your wallet that you can later set to the type and interest rate of your choice. However, I found that it would have broken this principle because I could not replace a discover with a visa (and who would want to?).

<b>Interface segregation principle</b> This program does not implement any interfaces therefore I did not follow this principle. I would have created a Discover, MasterCard and Visa objects that would have implemented a credit card interface. However, I feel the current program is just as efficient. 

<b>Dependency Inversion Principle</b> Rather than have wallet instantiate a credit card object, I decided to create a method that passes in a credit card object instead so that the wallet can exist even if it doesn't have a credit card. That gives the program more flexibility because I can create a credit card even after a wallet is created and added to a customer object. 
