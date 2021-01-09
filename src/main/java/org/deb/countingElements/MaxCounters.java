package org.deb.countingElements;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0};
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int[] arr = new int[N];
        for (int i = 0; i <A.length; i++){
            if (A[i] != N+1){
                arr[A[i]-1]++;
                max = Math.max(max,arr[A[i]-1]);
            }else {
                Arrays.fill(arr,max);
            }
        }
        return arr;
    }
}
