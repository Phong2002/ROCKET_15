package com.testing.entity;

public class HinhChuNhat extends HinhHoc{
    private float a ;
    private float b;

    public HinhChuNhat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float chuVi(){
        return (a+b)*2;
    }

    @Override
    public float dienTich() {
        return a*b;
    }
}
