package com.ptit.code.laptrinhcoban;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
//1
//
//1221
//
//1234567891011121314151617181920212223242526272829