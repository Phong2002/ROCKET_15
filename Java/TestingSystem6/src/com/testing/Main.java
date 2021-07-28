package com.testing;

import java.util.Scanner;

public class Main {

    public static void Question1_2() {
        //Question 1:
       try {
           System.out.println("Question 1: ");
           float result = divide(7, 0);
           System.out.println(result);
       }
       catch (ArithmeticException e){
           System.out.println("Cannot divide 0");
       }
       // Question 2:
        finally {
           System.out.println("Divide complete!");
       }
    }

    public static float divide(int a,int b){
    return (a/b);
    }


    public static void Question3() {
        try {

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of");
        }
    }

    public static void Question4() {
        Scanner sc = new Scanner(System.in);
        try {
            String[] Department = {"Bao ve", "Nhan vien", "Giam Doc"};
            int index = sc.nextInt();
            System.out.println(Department[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department");
        }
    }

    public static void Question5

    public static void main(String[] args) {
        Question4();
    }

}