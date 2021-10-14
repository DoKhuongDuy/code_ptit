package com.ptit.code.dequy;

import java.util.Scanner;

public class T309 {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] f = new int[n + 5];
            f[0] = 1;
            f[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= Math.min(i, k); j++) {
                    f[i] = (f[i] + f[i - j]) % mod;
                }
            }
            System.out.println(f[n]);
        }
    }
}
//2
//
//2 2
//
//4 2
//
//2
//
//5