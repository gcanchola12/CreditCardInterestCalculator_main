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

In designing this program, I decided to take a real life approach because it was the best way of implementing the S.O.L.I.D principles. In the real world, a customer can have a credit card, they can enter it in their wallet, and then put their wallet away with their other wallets to start a collection. Later, when they want to calculate how much money is going toward interest, they might take out their calculators and do some math. Similarly, this program contains 4 objects: 1 credit card, 1 wallet, 1 'person with more wallets' object. 

<b>Single Responsibility</b> Each object has a single job. For example, rather than have each object handle its own calculations, it was more efficient to have a single calculator class that handles the calculations for the rest of the classes. 

<b>Open-closed principle</b> As stated, each object instantiates the calculator object to calculate the total interest or sum of interest. The customer object extends upon it by using it to find the total for each wallet in the collection, but then it adds each sum to find the total for the collection of wallets - without modifying the calculator class at all. 

<b>Liskov substitution principle</b> I considered creating an object for each type of credit card and have them inherent from a credit card class to more closely reflect how real life people use credit cards. After all, you don't have generic credit cards in your wallet that you can later set to the type and interest rate of your choice. However, I found that it would have broken this principle because I could not replace a discover with a visa (and who would want to?).

<b>Interface segregation principle</b> This program does not implement any interfaces therefore I did not follow this principle. I would have created a Discover, MasterCard and Visa objects that would have implemented a credit card interface. However, I feel the current program is just as efficient. 

<b>Dependency Inversion Principle</b> Rather than have wallet instantiate a credit card object, I decided to create a method that passes in a credit card object instead so that the wallet can exist even if it doesn't have a credit card. That gives the program more flexibility because I can create a credit card even after a wallet is created and added to a customer object. 
