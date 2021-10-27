package com.ptit.code.laptrinhcoban;

import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s1 = string.split("");
        System.out.println(print(s1));
    }

    private static int print(String[] s1) {
        int dem = 0;
        StringBuilder result = new StringBuilder();
        for (String value : s1) {
            if (!result.toString().contains(value)) {
                dem++;
            }
            result.append(value);
        }
        return dem;
    }
}
