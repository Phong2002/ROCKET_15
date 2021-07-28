package com.testing;

public class EX2_Exception {

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

    public static void Question3(){
        int [] numbers ={1,2,3};
        System.out.println(numbers[10]);

    }

    public static void main(String[] args) {
        Question3();
    }

}
