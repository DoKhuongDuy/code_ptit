package com.ptit.code.huongdoituong.J04007;

public class NhanVien {
    private String maNV;
    private String name;
    private String gender;
    private String birthDate;
    private String address;
    private String taxCode;
    private String signDate;

    public NhanVien(String maNV, String name, String gender, String birthDate, String address, String taxCode, String signDate) {
        this.maNV = maNV;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.taxCode = taxCode;
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return maNV + " " + name + " " + gender + " "
                + birthDate + " " + address + " " + taxCode + " " + signDate;
    }
}
