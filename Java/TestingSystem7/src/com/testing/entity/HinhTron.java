package com.testing.entity;

public class HinhTron extends HinhHoc {
    private float r;
    public HinhTron(float r){
        this.r=r;
    }
    public float chuVi(){
        return (float) 2*MyMath.PI*r;
    }

    @Override
    public float dienTich() {
        return (float)MyMath.PI*r*r;
    }


}
