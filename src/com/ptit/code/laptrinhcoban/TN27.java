package com.ptit.code.laptrinhcoban;

import java.util.Objects;
import java.util.Scanner;

public class TN27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[] stringA = String.valueOf(a).split("");
        String[] stringB = String.valueOf(b).split("");
        for (int i = 0; i < stringA.length; i++) {
            if (Objects.equals(stringA[i], "6")) {
                stringA[i] = stringA[i].replace("6", "5");
            }
            if (Objects.equals(stringB[i], "6")) {
                stringB[i] = stringB[i].replace("6", "5");
            }
        }
        StringBuilder sbaMin = new StringBuilder();
        for (String s : stringA) {
            sbaMin.append(s.toString());
        }
        StringBuilder sbbMin = new StringBuilder();
        for (String s : stringB) {
            sbbMin.append(s.toString());
        }
        int aMin = Integer.parseInt(sbaMin.toString());
        int bMin = Integer.parseInt(sbbMin.toString());

        for (int i = 0; i < stringA.length; i++) {
            if (Objects.equals(stringA[i], "5")) {
                stringA[i] = stringA[i].replace("5", "6");
            }
            if (Objects.equals(stringB[i], "5")) {
                stringB[i] = stringB[i].replace("5", "6");
            }
        }
        StringBuilder sbaMax = new StringBuilder();
        for (String s : stringA) {
            sbaMax.append(s);
        }
        StringBuilder sbbMax = new StringBuilder();
        for (String s : stringB) {
            sbbMax.append(s);
        }
        int aMax = Integer.parseInt(sbaMax.toString());
        int bMax = Integer.parseInt(sbbMax.toString());

        System.out.println((aMin + bMin) + " " + (aMax + bMax));
    }

}
