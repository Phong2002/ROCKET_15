package com.testing.ex;

import com.sun.jdi.Value;

public class EX3_BoxingUnboxing {
    public static void main(String[] args) {
        // Question 2 :
        System.out.println("Question 2 :");
        String q2 = "123456";
        int Iq2 = Integer.valueOf(q2);
        System.out.println(Iq2);

        // Question 3 :
        System.out.println("Question 3 : ");
        Integer q3 = Integer.valueOf(Iq2);
        System.out.println(q3+1);

    }
}
