package com.ptit.code.laptrinhcoban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = hop(A, B);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    private static ArrayList<Integer> hop(int[] A, int[] B) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int j : A) {
            if (!listA.contains(j)) {
                listA.add(j);
            }
        }
        for (int j : B) {
            if (!listB.contains(j)) {
                listB.add(j);
            }
        }
        for (Integer integer : listA) {
            if (!result.contains(integer)) {
                result.add(integer);
            }
        }
        for (Integer integer : listB) {
            if (!result.contains(integer)) {
                result.add(integer);
            }
        }
        Collections.sort(result);
        return result;
    }
}
//5 6
//
//1 2 3 4 5
//
//3 4 5 6 7 8
//
//1 2 3 4 5 6 7 8