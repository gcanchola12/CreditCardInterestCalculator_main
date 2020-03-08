# Credit Card Interest Calculator

A calculator for calculating credit card interest. 

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

```bash
creditCard.getInterestPayment();
wallet.getTotalWalletInterest();
customer.getTotalWalletsInterest();
```



## Testing

```python
import foobar

foobar.pluralize('word') # returns 'words'
foobar.pluralize('goose') # returns 'geese'
foobar.singularize('phenomena') # returns 'phenomenon'
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
