package com.ptit.code.huongdoituong.J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Gamethu {
    private String ma;
    private String hoten;
    private Date giovao;
    private Date giora;
    private long thoigianchoi;

    public Gamethu(String ma, String hoten, String giovao, String giora) throws ParseException {
        this.ma = ma;
        this.hoten = hoten;
        this.giovao = new SimpleDateFormat("hh:mm").parse(giovao);
        this.giora = new SimpleDateFormat("hh:mm").parse(giora);
        this.thoigianchoi = this.giora.getTime() - this.giovao.getTime();
    }

    public long getThoigianchoi() {
        return thoigianchoi;
    }

    public void setThoigianchoi(long thoigianchoi) {
        this.thoigianchoi = thoigianchoi;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + ((thoigianchoi / (1000 * 60 * 60)) % 24) + " gio "
                + ((thoigianchoi / (1000 * 60)) % 60) + " phut";
    }
}
