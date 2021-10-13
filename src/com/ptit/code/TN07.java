package com.ptit.code;

import java.util.Scanner;

public class TN07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (check(s)) {
            if (s.isEmpty()) {
                break;
            }
            s = handle(s);
        }
        if (s.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }

    private static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static String handle(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                break;
            }
        }
        return sb.toString();
    }
}
//aaabccddd
//abd

//abba
//empty
