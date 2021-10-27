package com.ptit.code.laptrinhcoban;

import java.util.Scanner;

public class TN02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0) {
            long n = scanner.nextLong();
            if (checkNT(n)) {
                System.out.println(n);
            } else {
                for (long i = (long)Math.sqrt(n) * 4; i >= 2; i--) {
                    if (checkNT(i) && (n % i == 0)) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    private static boolean checkNT(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//2
//
//315
//
//31
//
//7
//
//31