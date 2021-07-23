package com.testing.ex.ex5_Inheritance.Question1;

import java.util.Scanner;

public class CongNhan extends canBo{

    public int capBac;
    public CongNhan(int capBac) {
        this.capBac = capBac;
    }
    public CongNhan (){};

    @Override
    public void getInfor() {
        Scanner sc= new Scanner(System.in);
        super.getInfor();
        System.out.println("Cap bac cong nhan : ");
        int capbac = sc.nextInt();
        this.capBac=capbac;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Cap bac cong nhan : "+capBac);
    }
}
