package com.shoppingbasket.strategy;

/**
 * Concrete implementation for buy two and get one free strategy.
 */
public class BuyTwoGetOneStrategy implements PricingStrategy {
	
	private final double price;
	
	public BuyTwoGetOneStrategy(double price) {
		this.price = price;
	}

	@Override
	public double calculatePrice(int count) {
		
		/**
		 * Decide total payable items considering buy 2, get 1 free.
		 */
		 int payableItems = (count/3) * 2 + (count%3);
		 
		 return payableItems * price;
	}
	

}
