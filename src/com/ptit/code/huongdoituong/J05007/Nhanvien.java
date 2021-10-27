package com.ptit.code.huongdoituong.J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nhanvien {
    private String maNV;
    private String hoten;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String masothue;
    private Date ngaykyhopdong;

    public Nhanvien(int maNV, String hoten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngaykyhopdong) throws ParseException {
        this.maNV = String.format("%05d", maNV);
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykyhopdong = new SimpleDateFormat("dd/MM/yyyy").parse(ngaykyhopdong);
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return maNV + " " + hoten + " " + gioitinh + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + diachi + " " + masothue + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(ngaykyhopdong);

    }
}