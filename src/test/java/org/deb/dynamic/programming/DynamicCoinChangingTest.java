package org.deb.dynamic.programming;



import org.junit.Assert;
import org.junit.Test;



public class DynamicCoinChangingTest {

	DynamicCoinChanging dc = new DynamicCoinChanging();

	@Test
	public void testChangeCoins() {
		Assert.assertEquals(2, dc.changeCoins(new int[] { 1, 3, 4 }, 6));
		Assert.assertEquals(2, dc.changeCoins(new int[] { 1, 3, 4 }, 7));
		Assert.assertEquals(3, dc.changeCoins(new int[] { 1, 2, 4 }, 7));
		Assert.assertEquals(2, dc.changeCoins(new int[] { 1, 2, 4 }, 8));
		Assert.assertEquals(3, dc.changeCoins(new int[] { 1, 2, 4 }, 9));
	}

}
