package com.testing.ex.ex5_Inheritance.Question1;

import java.nio.Buffer;
import java.util.Scanner;

public class canBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public void getInfor(String hoTen,int tuoi,String gioiTinh,String diaChi){
        this.hoTen = hoTen;
        this.tuoi= tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi=diaChi;
    }
    public void getInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String hoten = sc.nextLine();
        this.hoTen = hoten;
        System.out.println("Nhap tuoi : ");
        int tuoi = sc.nextInt();
        this.tuoi = tuoi;
        System.out.println("Nhap gioi tinh : ");
        String gioitinh = sc.nextLine();
        this.gioiTinh=gioitinh;
        System.out.println("Nhap dia chi : ");
        String diaChi = sc.nextLine();
        this.diaChi= diaChi;
    }
    public void display(){
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Gioi tinh : "+gioiTinh);
        System.out.println("Dia chi : "+diaChi);
    }
    public String getHoten(){
        return hoTen;
    }
}
