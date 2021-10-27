package com.ptit.code.huongdoituong.J05018;

public class Hocsinh {
    private String maHS;
    private String hoten;
    private float diemtoan;
    private float diemtiengviet;
    private float diemngoaingu;
    private float diemvatly;
    private float diemhoahoc;
    private float diemsinhhoc;
    private float diemlichsu;
    private float diemdia;
    private float diemgdcd;
    private float diemcongnghe;
    private float trungbinh;
    private String xeploai;

    public Hocsinh(int maHS, String hoten, String diemtoan, String diemtiengviet, String diemngoaingu, String diemvatly, String diemhoahoc, String diemsinhhoc, String diemlichsu, String diemdia, String diemgdcd, String diemcongnghe) {
        this.maHS = "HS" + String.format("%02d", maHS);
        this.hoten = hoten;
        this.diemtoan = Float.parseFloat(diemtoan);
        this.diemtiengviet = Float.parseFloat(diemtiengviet);
        this.diemngoaingu = Float.parseFloat(diemngoaingu);
        this.diemvatly = Float.parseFloat(diemvatly);
        this.diemhoahoc = Float.parseFloat(diemhoahoc);
        this.diemsinhhoc = Float.parseFloat(diemsinhhoc);
        this.diemlichsu = Float.parseFloat(diemlichsu);
        this.diemdia = Float.parseFloat(diemdia);
        this.diemgdcd = Float.parseFloat(diemgdcd);
        this.diemcongnghe = Float.parseFloat(diemcongnghe);
    }

    public void tinhdiem() {
        trungbinh = (diemtoan * 2 + diemtiengviet * 2 + diemngoaingu + diemvatly + diemhoahoc
                + diemsinhhoc + diemlichsu + diemdia + diemgdcd + diemcongnghe) / 12;
        xeploai = getXeploai(this.trungbinh);
    }

    public float getTrungbinh() {
        return trungbinh;
    }

    private String getXeploai(float diem) {
        if (diem >= 9) return "XUAT SAC";
        if (diem >= 8) return "GIOI";
        if (diem >= 7) return "KHA";
        if (diem >= 5) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return maHS + " " + hoten + " " + String.format("%.1f", trungbinh) +
                " " + xeploai;
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  9.1  9.5  9.2  9.0  8.2  9.7  9.8  9.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0