package com.ptit.code.laptrinhcoban;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TN06 {
    static List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(chuanhoa(strings[i]));
        }
    }

    private static String chuanhoa(String input) {
        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String string = tokenizer.nextToken();
            for (int i = 0; i < string.length(); i++) {
                result.append(Character.toLowerCase(string.charAt(i)));
            }
            result.append(" ");
        }
        return toEmail(result.toString().trim());
    }

    private static String toEmail(String input) {
        String[] split = input.split(" ");
        StringBuilder result = new StringBuilder(String.valueOf(split[split.length - 1]));
        for (int i = 0; i < split.length - 1; i++) {
            result.append(split[i].charAt(0));
        }
        results.add(result.toString());

        int dem = (int) results.stream().filter(x -> x.contentEquals(result)).count();
        if (dem >= 2) {
            result.append(dem);
        }

        result.append("@ptit.edu.vn");
        return result.toString();
    }
}
//4
//
//    nGUYEn    quaNG   vInH
//
//   tRan   thi THU    huOnG
//
//   nGO   quoC  VINH
//
// lE            tuAn    aNH
//
//vinhnq@ptit.edu.vn
//
//huongttt@ptit.edu.vn
//
//vinhnq2@ptit.edu.vn
//
//anhlt@ptit.edu.vn

