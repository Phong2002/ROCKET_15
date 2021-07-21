package com.testing.ex;

import java.util.Locale;
import java.util.Scanner;

public class EX4_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1:
        System.out.println("Question 1:");
        String q1= sc.nextLine();
        int dem=0;
        char [] q1s = q1.toCharArray();
        for(Character x:q1s)
            if(x.toString().equals(" "))
                dem++;
        System.out.println("so cac ki tu String vua nhap la : "+(q1s.length-dem));

        // Question 2:
        System.out.println("Question 2 :");
        String q2s1 = sc.nextLine();
        String q2s2 = sc.nextLine();
        String ans2 = q2s1.concat(q2s2);
        System.out.println(ans2);

        // Question 3:
        System.out.println("Question 3: ");
        String name3 = sc.nextLine();
        String chuDau = name3.substring(0,1).toUpperCase();
        String conLai = name3.substring(1);
        String tenMoi = chuDau.concat(conLai);
        System.out.println(tenMoi);

        //Question 4:
        System.out.println("Question 4 : ");
        String q4 = sc.nextLine();
        for (Character x : q4.toCharArray())
            System.out.println(x.toString().toUpperCase());

        // Question 5:
        System.out.println("Question 5 : ");
        String ho = sc.nextLine();
        String ten = sc.nextLine();
        String tendu = ho.concat(" ").concat(ten);
        System.out.println(tendu);

        // Question 6:
        System.out.println("Question 6 : ");

    }
}

