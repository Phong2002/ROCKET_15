package com.testing.entity;

import java.util.Arrays;

public class Employee<T>  {
    private int ID;
    private String Name;
    private T [] Salaries;

    public Employee(int ID, String name, T[] salaries) {
        this.ID = ID;
        Name = name;
        Salaries = salaries;
    }

    public void displayEmpt(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Salaries : ");
        for (T salaries:Salaries)
            System.out.print(salaries+" ");
        System.out.println();
    }

    public void FiSalary(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Final Salary : "+Salaries[Salaries.length-1]);
    }
}
