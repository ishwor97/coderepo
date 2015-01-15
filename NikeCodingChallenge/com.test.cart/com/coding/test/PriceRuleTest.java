package com.coding.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cart.service.Supermarket;
import com.cart.service.impl.SuperMarketImpl;

/**
 * The Class PriceRuleTest.
 */
public class PriceRuleTest {

	/** The market. */
	private Supermarket market;

	/**
	 * Instantiates a new price rule test.
	 */
	public PriceRuleTest() {
		market = new SuperMarketImpl();

	}

	/**
	 * Test price for total products
	 */
	@Test
	public void testPriceInGeneral() {
		assertEquals("Total Price for Product", 240,
				market.checkOut("ABBACBBAB"));

	}

	@Test
	// IF B==7 [(3+2) Price]
	public void testPriceWithProductBCase1() {
		assertEquals("Total Price for Product", 350,
				market.checkOut("AABBBBBBBCC"));

	}

	@Test
	// IF B==10[(3*2) Price Value]
	public void testPriceWithProductBCase2() {
		assertEquals("Total Price for Product", 400,
				market.checkOut("AABBBBBBBBBBCC"));

	}

	@Test
	// IF B==12[(3*2 + 2) Price Value]
	public void testPriceWithProductBCase3() {
		assertEquals("Total Price for Product", 500,
				market.checkOut("AABBBBBBBBBBCCBB"));
	}

}
