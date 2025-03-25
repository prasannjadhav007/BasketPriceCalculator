# Shopping Basket Pricing

This Java application calculates the total price of a shopping basket based on different pricing strategies applied to fruits. The application uses the **Strategy Design Pattern** to define different pricing strategies for each type of fruit, making the code flexible for future enhancements and allowing easy changes to pricing rules.

## Features

- **Normal Pricing**
- **Buy One Get One Free**
- **Buy Two Get One Free**

## Technologies Used

- Java 8 (Streams API)
- Object-Oriented Programming (OOP) principles
- Strategy Design Pattern
- JUnit for unit testing

## How It Works

The ShoppingBasket class contains a method calculateTotalPrice(List<String> fruits) that calculates the total cost of the basket based on the list of fruits passed to it. 

### Strategy Design Pattern

The Strategy Design Pattern is used to apply different pricing strategies based on the fruit type. Each fruit type has its own PricingStrategy that decides how its price is calculated.

This separation of pricing logic into different strategy classes makes the application easily extendable, allowing new pricing strategies to be added without modifying existing code.

## How to Run

1. Clone the repository:
   
   git clone https://github.com/prasannjadhav007/BasketPriceCalculator.git

2. Compile and run com.shoppingbasket/src/main/java/com/shoppingbasket/model/ShoppingBasket.java

3. Alter fruits ArrayList for different outputs

4. Use com.shoppingbasket/src/test/java/com/shoppingbasket/test/ShoppingBasketTest.java for Unit Testing
