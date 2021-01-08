package org.deb;

import java.util.Arrays;

public class Demo {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i = 1; i < A[A.length - 1]; i++) {
            if (Arrays.binarySearch(A, i) < 0) {
                return i;
            }
        }

        return Math.max(1, A[A.length - 1] + 1);
    }


}
