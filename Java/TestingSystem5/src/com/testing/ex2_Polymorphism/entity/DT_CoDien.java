package com.testing.ex2_Polymorphism.entity;

public class DT_CoDien extends DienThoai implements VuKhi {
    public void NgheRadio(){
        System.out.println("Dang nghe Radio ...");
    }
    @Override
    public void tanCongKeXau() {
        System.out.println("Aim enermy!");
    }

}
