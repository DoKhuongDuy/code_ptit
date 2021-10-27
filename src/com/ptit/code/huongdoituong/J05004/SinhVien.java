package com.ptit.code.huongdoituong.J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float diem;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float diem) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ma +" "+ ten + " " + lop + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) +
                " " + String.format("%.2f", diem);
    }

    void chuanhoa() {
        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(ten);
        while (tokenizer.hasMoreTokens()) {
            String string = tokenizer.nextToken();
            result.append(Character.toUpperCase(string.charAt(0)));
            for (int i = 1; i < string.length(); i++) {
                result.append(Character.toLowerCase(string.charAt(i)));
            }
            result.append(" ");
        }
        this.ten = result.toString().trim();
    }
}
