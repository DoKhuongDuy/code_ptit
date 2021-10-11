package com.ptit.code;

import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test --> 0) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            System.out.println(bcnn(a,b) + " " + ucln(a,b));
        }
    }
    public static long ucln(long a, long b) {
        long temp1 = a;
        long temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        long uscln = temp1;
        return uscln;
    }
    public static long bcnn(long a, long b) {
        return (a * b) / ucln(a, b);
    }

}
//2
//
//5 10
//
//14 8

//10 5
//
//56 2
