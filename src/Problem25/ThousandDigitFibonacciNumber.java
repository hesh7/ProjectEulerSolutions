package Problem25;

import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {
    public static void main(String[] args) {
        BigInteger limit = new BigInteger("10");
        limit = limit.pow(999);
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.add(b);
        a = b;
        b = c;
        int count = 3;
        while(a.compareTo(limit) < 0) {
            c = a.add(b);
            a = b;
            b = c;
            count++;
        }
        System.out.println(count);
    }
}
