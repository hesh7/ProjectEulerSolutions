package com.company.Problem34;

public class DigitFactorials {
    public static void main ( String[] args ) {
        System.out.println(new Solver().solve());
    }
}

class Solver {
    public int solve () {
        int[] facts = new int[10];
        int result = 0;
        for (int i = 0; i < 10; i++) {
            facts[i] = factorial(i);
        }
        for (int i = 10; i < 2540161; i++) {
            int sumOfFacts = 0;
            int number = i;
            while (number > 0) {
                int d = number % 10;
                number /= 10;
                sumOfFacts += facts[d];
            }

            if (sumOfFacts == i) {
                result += i;
            }
        }
        return result;
    }

    private int factorial ( int i ) {
        if(i == 0) return 1;
        return i*factorial(i-1);
    }

}
