package com.testing.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Student {
    public static int auto=0;
    private int id=0;
    private String name;
    private LocalDate ngaySinh;
    private double diem;

    public Student(String name){
        this.name=name;
        auto++;
        id=auto;
    }

    public Student( String name, LocalDate ngaySinh, double diem) {
        auto++;
        this.id = auto;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ("Name :" + name + "\nID :" + id);
    }



}
