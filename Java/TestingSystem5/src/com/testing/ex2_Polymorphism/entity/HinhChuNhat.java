package com.testing.ex2_Polymorphism.entity;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat(float a,float b){
        this.chieuDai=a;
        this.chieuRong=b;
    }

    public float chuVi(){
        return (chieuDai+chieuRong)*2;
    }

    public float dienTich(){
        return (chieuDai*chieuRong);
    }

}
