package com.ptit.code;

import java.util.Scanner;

public class TN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test;
        long[] fibonacci = new long[93];
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        test = scanner.nextInt();
        while (test --> 0) {
            int n = scanner.nextInt();
            long fibo = caculate(fibonacci, n);
            System.out.println(fibo);
        }
    }

    private static long caculate(long[] fibo, int n) {
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n];
    }

}