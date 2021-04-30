package com.company.Problem26;

import java.util.HashMap;

public class ReciprocalCycles {

    public static void main ( String[] args ) {
        int maxCycleLength = 0;
        for ( int i = 1; i <= 1000; i++ ) {
            maxCycleLength = Math.max(maxCycleLength, new Solver().findCycleLength(14));
        }
        System.out.println(maxCycleLength+1);
    }
}

class Solver {
    public int findCycleLength ( int n ) {
        HashMap<Integer, Integer> decimalNumberIndexMap = new HashMap<>();
        int i = 1;
        i = ( i * 10 ) % n;
        int index = 1;
        while (!decimalNumberIndexMap.containsKey(i)) {
            decimalNumberIndexMap.put(i, index);
            i = ( i * 10 ) % n;
            index++;
        }
        return index - decimalNumberIndexMap.get(i);
    }

}
