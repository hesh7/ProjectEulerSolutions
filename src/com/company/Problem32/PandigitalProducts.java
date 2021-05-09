package com.company.Problem32;

import java.util.Arrays;

public class PandigitalProducts {
    public static void main ( String[] args ) {
        System.out.println(new Solver().solve());
    }
}

class Solver {
    public int solve () {
        // a*b = p.
        // noOfDigits(a)+noOfDigits(b)+noOfDigits(p) = 9
        //It can only happen if no of digits in p is at max 4.
        int sum = 0;
        for ( int i = 1; i < 10000; i++ ) {
            if (isPandigitalProduct(i)) {
                sum+=i;
            }
        }
        return sum;
    }

    private boolean isPandigitalProduct ( int n ) {
        for ( int i = 1; i <= n; i++ ) {
            if (n % i == 0 && isPandigital("" + n + i + n / i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPandigital ( String s ) {
        if (s.length() != 9) {
            return false;
        }
        char[] num = s.toCharArray();
        Arrays.sort(num);
        return ( new String(num) ).equals("123456789");
    }
}
