  package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 0;
        int  u=200,  l=1;

        for (int x = l + 1; x <= u - 1; x++) {
            for (i = 2; i < x; i++)
                if (x % i == 0)
                    break;
            if (i == x)
                System.out.println("prime numbers are" + x);
        }
    }
}
