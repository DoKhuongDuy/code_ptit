package com.ptit.code.dequy;

import java.util.Scanner;

public class T307 {
    public static void main(String[] args) {
        long[] f = new long[55];
        f[1] = 1;
        f[2] = 2;
        f[3] = 4;
        for (int i = 4; i <= 50; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(f[n]);
        }
    }
}
//2
//1
//5
//
//1
//13