package com.ptit.code;

import java.util.Arrays;
import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String[] strings = String.valueOf(n).split("");
        long dem4 = Arrays.stream(strings).filter(string -> string.equals("4")).count();
        long dem7 = Arrays.stream(strings).filter(string -> string.equals("7")).count();
        if ((dem4 + dem7 == 4) || (dem4+dem7) == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//40047
//
//NO
//
//7747774
//
//YES
//
//1000000000000000000
//
//NO