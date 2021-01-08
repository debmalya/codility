package org.deb;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void solution() {
        Demo demo = new Demo();
        assertEquals(1, demo.solution(new int[]{-1, -3}));
        assertEquals(4, demo.solution(new int[]{1, 2, 3}));
        assertEquals(5, demo.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}