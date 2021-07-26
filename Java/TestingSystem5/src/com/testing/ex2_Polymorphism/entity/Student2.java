package com.testing.ex2_Polymorphism.entity;

import java.util.Scanner;

public class Student2 extends Person{
    private String MSV;
    private int diemTB;
    private String email;

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public int getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Ma sinh vien : ");
        setMSV(sc.nextLine());
        System.out.println("Diem trung binh : ");
        setDiemTB(Integer.valueOf(sc.nextLine()));
        System.out.println("Email : ");
        setEmail(sc.nextLine());
    }

    public void showInfor(){
        System.out.println("Ma sinh vien : "+getMSV());
        super.ShowInfo();
        System.out.println("Diem trung binh : "+getDiemTB());
        System.out.println("Email : "+getEmail());
    }

    public void xetHocBong(){
        if (diemTB >=8)
            System.out.println("Sinh vien nay duoc hoc bong");
        else
            System.out.println("Sinh vien nay khong duoc hoc bong");
    }

}
