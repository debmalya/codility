package org.deb;

import java.util.Arrays;

public class Demo {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int a = 1;
        for (int i = 1; i < A[A.length-1]; i++){
            if (Arrays.binarySearch(A,i)<0){
                return i;
            }
        }
        if (A[A.length-1]>0){
            return A[A.length -1]+1;
        }
        return a;
    }

   
}
