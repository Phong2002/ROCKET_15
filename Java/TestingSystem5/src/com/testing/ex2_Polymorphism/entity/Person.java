package com.testing.ex2_Polymorphism.entity;

import java.util.Date;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Person {
    private String name;
    private String gender;
    private Date ngaySinh;
    private String diaChi;

    public Person(){

    }

    public Person(String name,String gender,Date ngaySinh,String diaChi){
        this.name=name;
        this.gender=gender;
        this.ngaySinh=ngaySinh;
        this.diaChi=diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Name :");
        setName(sc.nextLine());
        System.out.println("Gioi tinh (Male,Female,Unknow):");
        setGender(sc.nextLine());
        System.out.println("Ngay sinh :");
        setNgaySinh(new Date( Date.parse(sc.next())));
        System.out.println("Dia chi :");
        setDiaChi(sc.nextLine());
    }

    public void ShowInfo(){
        System.out.println("Name :"+name);
        System.out.println("Gioi tinh :"+gender);
        System.out.println("Ngay sinh :"+ngaySinh);
        System.out.println("Dia chi :"+diaChi);
    }

}
