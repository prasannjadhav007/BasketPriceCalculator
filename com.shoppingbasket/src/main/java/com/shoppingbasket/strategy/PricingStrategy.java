package com.shoppingbasket.strategy;

/**
 * Strategy design pattern implementation for 
 * Pricing with calculatePrice method
 */
public interface PricingStrategy {
	double calculatePrice(int count);
}
