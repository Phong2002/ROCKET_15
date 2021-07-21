package com.testing.ex;

import com.sun.jdi.Value;

import java.util.Random;

public class EX1_DatatypeCasting {

    public static void thuong(int a , int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1 : ");
        float acc1 = (float) 5240.5;
        float acc2 = (float) 10970.055;
        int Iacc1  = (int) acc1;
        int Iacc2  = (int) acc2;
        System.out.println("Tiền lương nhân viên 1 : "+Iacc1);
        System.out.println("Tiền lương nhân viên 2 : "+Iacc2);

        // Question 2:
        Random rd = new Random();
        int q2 = rd.nextInt(100000);
        String s2 = String.valueOf(q2);

        // Question 5:
        thuong(10,5);

    }
}
