package com.ptit.code.dequy;

import java.util.Scanner;

public class T208 {
    static int modulo = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test --> 0) {
            long n = scanner.nextLong();
            System.out.println(fibo(n)%modulo);
        }
    }

    public static long fibo(long n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
//3
//
//2
//
//6
//
//20
//
//1
//
//8
//
//6765