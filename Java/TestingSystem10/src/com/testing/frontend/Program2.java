package com.testing.frontend;

import com.testing.backend.DepartmentDao;
import com.testing.entity.Department;

import java.sql.SQLException;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = new DepartmentDao();
        for (Department dept : departmentDao.getDepartments()) {
            System.out.println(dept.toString());
        }
//        try {
//            System.out.println(departmentDao.getDeptByID(sc.nextLine()).toString());
//        } catch (NullPointerException e) {
//
//        }

//        System.out.println(departmentDao.isDepartmentNameExists(sc.nextLine()));
//    }
//        departmentDao.updateDepartmentName(Integer.valueOf(sc.nextLine()),sc.nextLine());


        departmentDao.deleteDepartmentUsingProcedure(Integer.valueOf(sc.nextLine()));
}}
