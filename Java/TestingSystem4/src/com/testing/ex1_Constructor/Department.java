package com.testing.ex1_Constructor;

public class Department {
    public int DepartmentID;
    public String DepartmentName;

    public Department(){
        DepartmentID=0;
    };
    public Department(String DepartmentName){
        this.DepartmentName = DepartmentName;
        DepartmentID=0;
    }
}
