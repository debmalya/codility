package org.deb.dynamic.programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberSolitaireTest {

	NumberSolitaire numberSolitaire = new NumberSolitaire();

	@Test
	void testSolution() {
		assertEquals(8, numberSolitaire.solution(new int[] { 1, -2, 0, 9, -2 }));
		assertEquals(18, numberSolitaire.solution(new int[] { 1, -2, 0, 9, 10, -11, -12, -2 }));
		assertEquals(31, numberSolitaire.solution(new int[] { 1, -2, 0, 9, 10, -11, -12, 13, -2 }));
		assertEquals(111, numberSolitaire.solution(new int[] { 1, -2, 0, 9, 10, -11, -12, 13, 14, 15, 16, 17, 18, -2 }));
	}

}
