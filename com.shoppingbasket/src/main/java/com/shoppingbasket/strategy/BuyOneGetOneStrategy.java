package com.shoppingbasket.strategy;

/**
 * Concrete implementation for buy one and get one free strategy.
 */
public class BuyOneGetOneStrategy implements PricingStrategy{

	private final double price;
	
	public BuyOneGetOneStrategy(double price) {
		this.price = price;
	}
	
	@Override
	public double calculatePrice(int count) {
		
		/**
		 * Decide total payable items considering buy 1, get 1 free.
		 */
		int payableCount = (count/2) + (count%2);
		
		return payableCount * price;
	}

}
