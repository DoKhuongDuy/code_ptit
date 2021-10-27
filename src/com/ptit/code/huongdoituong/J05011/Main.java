package com.ptit.code.huongdoituong.J05011;

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
        List<Gamethu> list = new ArrayList<>();
        while (test-- > 0) {
            Gamethu gamethu = new Gamethu(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            list.add(gamethu);
        }
        list.sort(Comparator.comparing(Gamethu::getThoigianchoi).reversed());
        list.forEach(gamethu -> System.out.println(gamethu.toString()));
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00
