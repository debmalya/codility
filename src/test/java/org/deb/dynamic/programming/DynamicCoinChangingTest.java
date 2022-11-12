package org.deb.dynamic.programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DynamicCoinChangingTest {

	DynamicCoinChanging dc = new DynamicCoinChanging();

	@Test
	public void testChangeCoins() {
		assertEquals(2, dc.changeCoins(new int[] { 1, 3, 4 }, 6));
		assertEquals(2, dc.changeCoins(new int[] { 1, 3, 4 }, 7));
		assertEquals(3, dc.changeCoins(new int[] { 1, 2, 4 }, 7));
		assertEquals(2, dc.changeCoins(new int[] { 1, 2, 4 }, 8));
		assertEquals(3, dc.changeCoins(new int[] { 1, 2, 4 }, 9));
	}

}
