package com.shoppingbasket.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.shoppingbasket.model.ShoppingBasket;

public class ShoppingBasketTest 
{

	
	@Test
    public void testNormalPricing() {
    	List<String> fruits = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Lime");
    	
    	double totalCost = ShoppingBasket.calculateTotalPrice(fruits);
    	
        assertEquals( 1.55, totalCost);
      
    }
    
	@Test
    public void testBuyOneGetOneFree() {
    	List<String> fruits = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
    	
    	double totalCost = ShoppingBasket.calculateTotalPrice(fruits);
    	
        assertEquals( 1.85, totalCost);
    }
	
	@Test
    public void testBuyTwoGetOneFree() {
    	List<String> fruits = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
    	
    	double totalCost = ShoppingBasket.calculateTotalPrice(fruits);
    	
        assertEquals( 1.85, totalCost);
    }
    

}
