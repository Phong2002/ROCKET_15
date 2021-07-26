package com.testing.ex1_Abstraction.entity;

public class QLTS {
    private String SBD;
    private String hoTen;
    private String diaChi;
    private int mucUT;
    private String khoiThi;
    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUT() {
        return mucUT;
    }

    public void setMucUT(int mucUT) {
        this.mucUT = mucUT;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }

    public String cacMon(String KhoiThi){
        if( KhoiThi.equals("A"))
            return ("Toan , Ly , Hoa ");
        else if (KhoiThi.equals("B"))
            return ("Toan , Hoa , Sinh ");
        else if (KhoiThi.equals("C"))
            return ("Van , Su , Dia");
        return "Khong co khoi nay !";

    }
}
