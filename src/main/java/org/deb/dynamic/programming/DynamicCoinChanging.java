package org.deb.dynamic.programming;

import java.util.Arrays;

public class DynamicCoinChanging {

	/**
	 * For a given set of denominations, you are asked to find the minimum
	 * number of coins with which a given amount of money can be paid.
	 * 
	 * A dynamic algorithm finds solutions to this problem for all amounts not
	 * exceeding the given amount, and for increasing sets of denominations. For
	 * the example data, it would consider all the amounts from 0 to
	 * coinToBeChanged.
	 * 
	 * @param denominations
	 *            - an array of existing denominations. Assume that you can use
	 *            as many coins of a particular denomination as necessary.
	 * 
	 * @param coinToBeChanged
	 *            - coins to be converted to lower denominations.
	 * @return minimum number of coins to do this change, if not possible then
	 *         return -1.
	 */
	public int changeCoins(int[] denominations, int coinToBeChanged) {
		if (denominations == null || denominations.length == 0) {
			// if there are no denominations and the amount is positive, there
			// is no solution
			return -1;
		}
		Arrays.sort(denominations);
		int min = -1;
		for (int i = denominations.length - 1; i > -1; i--) {
			if (!(denominations[i] > coinToBeChanged)) {
				int requiredNoOfCoins = coinToBeChanged / denominations[i];
				int remaining = coinToBeChanged % denominations[i];

				if (remaining == 0) {
					if (min == -1) {
						min = requiredNoOfCoins;
					} else {
						min = Math.min(min, requiredNoOfCoins);
					}
				} else {
					// needs smaller coins
					int coins = Arrays.binarySearch(denominations, remaining);
					if (coins > -1) {
						requiredNoOfCoins += remaining / denominations[coins];
						if (min == -1) {
							min = requiredNoOfCoins;
						} else {
							min = Math.min(min, requiredNoOfCoins);
						}

					} else {
						coins = Math.abs(coins);
						int[] smallerDenominations = new int[coins];
						System.arraycopy(denominations, 0, smallerDenominations, 0, coins);
						requiredNoOfCoins += changeCoins(smallerDenominations,remaining);
						if (min == -1) {
							min = requiredNoOfCoins;
						} else {
							min = Math.min(min, requiredNoOfCoins);
						}
					}
				}

			}

		}
		return min;
	}

	public int changeCoins0(int[] denominations, int coinToBeChanged) {
		if (denominations == null || denominations.length == 0) {
			// if there are no denominations and the amount is positive, there
			// is no solution
			return -1;
		}
		// no coin needed to pay 0 amount.
		for (int j = 1; j <= coinToBeChanged; j++) {
			// if the amount to be paid is smaller than coinToBeChanged
			if (denominations[j] > coinToBeChanged) {
				continue;
			} else {
				// otherwise, we should consider two options and choose the one
				// requiring fewer coins:
				// either we use a coin of the highest denomination, and a
				// smaller amount to be paid
				// remains, or we don’t use coins of the highest denomination
			}

		}
		return -1;
	}
}
