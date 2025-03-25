package com.shoppingbasket.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.shoppingbasket.strategy.BuyOneGetOneStrategy;
import com.shoppingbasket.strategy.BuyTwoGetOneStrategy;
import com.shoppingbasket.strategy.NormalPricingStrategy;
import com.shoppingbasket.strategy.PricingStrategy;

/**
 * Context class which uses strategy objects and performs 
 * total cost calculation operation.
 */
public class ShoppingBasket {

	/**
	 * Below constants store the fixed price for each fruit
	 */
	private static final double APPLE_PRICE = 0.35;
	private static final double BANANA_PRICE = 0.20;
	private static final double MELON_PRICE = 0.50;
	private static final double LIME_PRICE = 0.15;

	/**
	 * calculateTotalPrice method calculates and returns the cost 
	 * @param fruits contains list of strings
	 * @return returns total cost
	 */
	public static double calculateTotalPrice(List<String> fruits) {
		Map<String, PricingStrategy> strategy = new HashMap<>();
		double totalCost = 0.0;

		/**
		 * Declare pricing strategies for each fruit item using Strategy design pattern
		 */
		strategy.put("Apple", new NormalPricingStrategy(APPLE_PRICE));
		strategy.put("Banana", new NormalPricingStrategy(BANANA_PRICE));
		strategy.put("Melon", new BuyOneGetOneStrategy(MELON_PRICE));
		strategy.put("Lime", new BuyTwoGetOneStrategy(LIME_PRICE));

		/**
		 * Create Map for count of each fruit
		 */
		Map<String, Long> fruitsCart = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		/**
		 * Traverse and calculate the total cost for the basket
		 */
		totalCost = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.keySet()
				.stream()
				.collect(Collectors.summingDouble(fruit -> strategy.get(fruit).calculatePrice((int)(long) fruitsCart.get(fruit))));

		return Math.round(totalCost * 100.0) / 100.0;

	}

	public static void main(String args[]) {

		List<String> fruits = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
		double totalCost = calculateTotalPrice(fruits);
		System.out.println("Total cost of shopping basket is " + totalCost);
	}

}
