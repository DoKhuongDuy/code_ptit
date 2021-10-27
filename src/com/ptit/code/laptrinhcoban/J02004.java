package com.ptit.code.laptrinhcoban;

import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0) {
            int si = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        String text = sb.reverse().toString();
        return s.equals(text);
    }

    //2
    //
    //4
    //
    //1 4 4 1
    //
    //5
    //
    //1 5 5 5 3
}
