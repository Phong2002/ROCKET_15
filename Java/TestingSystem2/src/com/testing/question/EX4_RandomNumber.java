package com.testing.question;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class EX4_RandomNumber {
    public static void main(String [] args ){
        Random rd = new Random();
        // Question 1:
        System.out.println("Question 1 :");
        int q1 = rd.nextInt();
        System.out.println(q1);

        // Question 2:
        System.out.println("Question 2 : ");
        float y = rd.nextFloat();
         System.out.println(y);

         // Question 3:
        System.out.println("Question 3 : ");
        String[] a = {"Bùi Xuân Huấn", "Ngô Bá Khá", "Nguyễn Thành Long", "Khánh Bầu Trời"};
        System.out.println(a[2]);

        // Question 4:
        System.out.println("Question 4 : ");
        int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + rd.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDay);

        // Question 5:
        System.out.println("Question 5: ");
        int dateNow = (int) new Date();

        // Question 7:'
        System.out.println("Question 7: ");
        int q7 = rd.nextInt(999 - 100 + 1) + 100;
        System.out.println("So co 3 chu so: " + q7);
    }
}
