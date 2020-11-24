package com.uttara.ds.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static long solve( long n ) {
        StringBuilder sb = new StringBuilder();

        for (long i = 1; i <= n; i++) {
            sb.append(Long.toBinaryString(i));
        }

        Long res = new BigInteger(sb.toString(), 2).longValue();
        return (res + (long) (Math.pow(10, 9) + 7)) % (long) (Math.pow(10, 9) + 7);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc1=new Scanner(System.in);
        long value=sc1.nextLong();
        long val=solve(value);
        System.out.println("Result = "+val);
    }
}
