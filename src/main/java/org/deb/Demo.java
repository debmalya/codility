package org.deb;

import java.util.Arrays;

public class Demo {
    public int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);
            int a = 1;
            int state = 0;
            for (int i = 1; i < A.length-1; i++){
                state = 1;
                if (A[i]>0 && A[i+1] > 0  ){
                    if (A[i+1]-A[i]>1) {
                        a = A[i] + 1;
                        state = 2;
                        break;
                    }
                }
            }
            if (state == 1){
                return A[A.length - 1]+1;
            }
            return a;
        }
}
