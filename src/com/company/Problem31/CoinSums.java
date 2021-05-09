package com.company.Problem31;

public class CoinSums {
    public static void main(String[] args) {
        System.out.println(new Solver().solve());
    }
}

class Solver {
    public int solve () {
        int[] noOfWays = new int[201];
        noOfWays[0] = 1;
        int[] coins = {1, 2, 5, 10, 20, 50,100, 200};
        for ( int i = 0; i < coins.length; i++ ) {
            for ( int j = coins[i]; j <= 200; j++ ) {
                noOfWays[j] += noOfWays[j - coins[i]];
            }
        }
        return noOfWays[200];
    }
}
