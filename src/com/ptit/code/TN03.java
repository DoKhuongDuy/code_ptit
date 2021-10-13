package com.ptit.code;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TN03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0) {
            String string = scanner.nextLine();
            String result = string.replaceAll("[^\\D]", "");
            String[] s1 = result.split("");
            System.out.println(print(s1));
        }
    }

    private static String print(String[] s1) {
        int dem = 0;
        Collator col = Collator.getInstance(new Locale("en", "EN"));
        Arrays.sort(s1, col);
        StringBuilder sorted = new StringBuilder();
        for (String value : s1) {
            if (!sorted.toString().contains(value)) {
                dem++;
            }
            sorted.append(value);
        }
        if (dem > 0) {
            return sorted.toString() + dem;
        } else {
            return "";
        }
    }
}
//2
//AC2BEW3
//ACCBA10D2EW30

//ABCEW5
//AABCCDEW6