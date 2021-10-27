package com.ptit.code.huongdoituong.J04015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien giaoVien = new GiaoVien(in.nextLine(), in.nextLine(), in.nextInt());
        giaoVien.tinhluong();
        System.out.println(giaoVien);
    }
}

//HP04
//Tran Quoc Huy
//1578000