package com.ptit.code.laptrinhcoban;

import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            long n = scanner.nextLong();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean check(long n) {
        String s = Long.toString(n);
        String[] strings = s.split("");
        for (int i = 0; i < strings.length - 1; i++) {
            if (Math.abs(Integer.parseInt(strings[i + 1]) - Integer.parseInt(strings[i])) != 1)
                return false;
        }
        return true;
    }
}
//3
//
//123212
//
//5654345676
//
//10233211123
//
//YES
//
//YES
//
//NO
