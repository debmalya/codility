package org.deb;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    void solution() {
        Demo demo = new Demo();
        assertEquals(1, demo.solution(new int[]{-1, -3}));
        assertEquals(4, demo.solution(new int[]{1, 2, 3}));
        assertEquals(5, demo.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(2, demo.solution(new int[]{1}));
    }
}