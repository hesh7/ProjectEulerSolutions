package com.company.Problem35;

public class CircularPrimes {
    public static void main ( String[] args ) {
        System.out.println(new Solver().solve());
    }
}

class Solver {
    public int solve () {
        int n = (int)Math.pow(10,6);
        boolean[] isPrime = sieveOfEratosthenes(n);
        int count = 0;
        for(int i = 0; i < isPrime.length; i++) {
            if(isCircularPrime(i, isPrime)) {
                count++;
            }
        }
        return count;
    }

    private boolean isCircularPrime ( int n, boolean[] isPrime ) {
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++) {
            if(!isPrime[Integer.parseInt(s.substring(i) + s.substring(0,i))]) {
                return false;
            }
        }
        return true;
    }

    private boolean[] sieveOfEratosthenes ( int n ) {
        boolean[] isPrime = new boolean[n+1];
        if(n >=2)
            isPrime[2] = true;
        if(n >=3)
            isPrime[3] = true;
        for(int i = 3; i <= n; i+=2) {
            isPrime[i] = true;
        }

        for(int i = 3; i <= Math.sqrt(n); i+=2) {
            if(isPrime[i]) {
                for(int j = i*i; j <= n; j+=i<<1) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
