package com.company.Problem28;

public class NumberOfSpiralDiagonals {
    public static void main(String[] args) {
        System.out.println(new Solver().solve(1001));
    }
}

class Solver {
    public long solve(int n){
        long val = n*n;
        long totalSum = val;
        for(int i = n-1; i >= 2; i-=2) {
            for(int j = 1; j <= 4; j++) {
                val-=i;
                totalSum+= val;
            }
        }
        return totalSum;
    }
}
