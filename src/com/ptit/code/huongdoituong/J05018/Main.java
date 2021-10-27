package com.ptit.code.huongdoituong.J05018;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        List<Hocsinh> list = new ArrayList<>();
        for (int i = 1; i <= test; i++) {
            String hoten = in.nextLine();
            Hocsinh hs = new Hocsinh(i, hoten, in.next(), in.next(), in.next(), in.next(),
                    in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
            hs.tinhdiem();
            list.add(hs);
            in.nextLine();
        }
        list.sort(Comparator.comparing(Hocsinh::getTrungbinh).reversed());
        list.forEach(hs -> System.out.println(hs.toString()));
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
