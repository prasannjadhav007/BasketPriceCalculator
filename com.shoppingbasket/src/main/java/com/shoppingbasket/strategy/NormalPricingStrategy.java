package com.shoppingbasket.strategy;


/**
 * Concrete implementation for normal strategy where each 
 * item will be costed individually.
 */

public class NormalPricingStrategy implements PricingStrategy{
	
	private final double price;
	
	public NormalPricingStrategy(double price) {
		this.price = price;
	}

	@Override
	public double calculatePrice(int count) {
		return count * price;
	}

}
