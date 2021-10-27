package com.ptit.code.huongdoituong.J05004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVien sv = new SinhVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Float.parseFloat(scanner.nextLine()));
            sv.chuanhoa();
            sinhViens.add(sv);
        }
        for (SinhVien sv : sinhViens) {
            System.out.println(sv);
        }
    }
}
//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
