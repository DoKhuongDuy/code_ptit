package com.ptit.code.huongdoituong.J04015;

public class GiaoVien {
    private String ma;
    private String hoten;
    private int luongcoban;
    private int bacluong;
    private int phucap;
    private int thunhap;

    public GiaoVien(String ma, String hoten, int luongcoban) {
        this.ma = ma;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
    }

    void tinhluong() {
        String[] strings = ma.split("");
        String chucvuGV = strings[0] + strings[1];
        String hesoluong = strings[2] + strings[3];
        this.bacluong = Integer.parseInt(hesoluong);
        this.phucap = chucvu.valueOf(chucvuGV).getPhucap();
        this.thunhap = luongcoban * bacluong + phucap;
    }

    // mã ngạch, họ tên, bậc lương, phụ cấp, thu nhập
    @Override
    public String toString() {
        return ma + " " + hoten + " " + bacluong + " " + phucap + " " + thunhap;
    }

    enum chucvu {
        HT(2000000), HP(900000), GV(500000);

        private final Integer phucap;

        chucvu(Integer phucap) {
            this.phucap = phucap;
        }

        public Integer getPhucap() {
            return phucap;
        }
    }
}
