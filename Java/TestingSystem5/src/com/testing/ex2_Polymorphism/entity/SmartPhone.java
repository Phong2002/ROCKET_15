package com.testing.ex2_Polymorphism.entity;

public class SmartPhone extends DienThoai implements IDienThoai {
    public void dung3G(){
        System.out.println("Dang dung 3G ...");
    }
    public void ChupAnh(){
        System.out.println("Dang chup anh ...");
    }

    @Override
    public void VuKhi() {
        System.out.println("Tap thang vao mat ke dich ...");
    }
}
