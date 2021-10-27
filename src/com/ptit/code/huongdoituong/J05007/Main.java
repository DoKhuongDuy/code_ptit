package com.ptit.code.huongdoituong.J05007;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        List<Nhanvien> list = new ArrayList<>();
        for (int i = 1; i <= test; i++) {
            Nhanvien nv = new Nhanvien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            list.add(nv);
        }
        list.sort(Comparator.comparing(Nhanvien::getNgaysinh));
        list.forEach(nhanvien -> System.out.println(nhanvien.toString()));
    }
}

//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011