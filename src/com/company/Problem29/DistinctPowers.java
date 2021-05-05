package com.company.Problem29;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {
    public static void main(String[] args) {
        System.out.println(new Solver().solve());
    }
}

class Solver {
    public long solve(){
        Set<BigInteger> set = new HashSet<>();
        for(int a = 2; a<=100;a++) {
            for(int b = 2; b<=100;b++) {
                BigInteger val = BigInteger.valueOf(a).pow(b);
                set.add(val);
            }
        }
        return set.size();
    }
}