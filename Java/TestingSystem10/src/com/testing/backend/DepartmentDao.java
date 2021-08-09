package com.testing.backend;

import com.testing.entity.Department;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {
        String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem";
        String username = "root";
        String password = "030502";
        List<Department> departmentList = new ArrayList<>();
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        Scanner sc = new Scanner(System.in);

    public DepartmentDao() throws SQLException {
    }

    public List<Department> getDepartments () throws SQLException {
            List<Department> departmentList = new ArrayList<>();
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            String q1 ="SELECT * FROM testingsystem.department;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q1);
            while(resultSet.next()){
                Department department = new Department(resultSet.getString(1),resultSet.getString(2));
                departmentList.add(department);
            }
            return departmentList;
        }

    public Department getDeptByID() throws SQLException {
        String getDeptbyID = "Select * from Department where departmentid = 5;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(getDeptbyID);
        if (resultSet.next()) {
            Department department = new Department(resultSet.getString(1), resultSet.getString(2));
            return department;
        } else {
            System.out.println("khong tim thay ID");
            return null;
        }
    }


    public Department getDeptByID(String ID) throws SQLException {
        String getDeptbyID = "Select * from Department where departmentid = ?;";
        PreparedStatement statement = connection.prepareStatement(getDeptbyID);
        statement.setString(1, ID);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Department department = new Department(resultSet.getString(1), resultSet.getString(2));
            return department;
        } else {
            System.out.println("khong tim thay ID");
            return null;
        }
    }

    public boolean isDepartmentNameExists(String name) throws SQLException {
        String isDepartmentNameExists = "Select * from Department where departmentname = ?;";
        PreparedStatement statement = connection.prepareStatement(isDepartmentNameExists);
        statement.setString(1, name);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }

    public void createDeppartment(String deptName) throws SQLException{
        String createDept ="INSERT INTO department (DepartmentName) VALUES (?);";
        PreparedStatement statement = connection.prepareStatement(createDept);
        statement.setString(1,deptName);
        if(isDepartmentNameExists(deptName))
            System.out.println("Department Name is Exists!");
        else {
           int x = statement.executeUpdate();
            System.out.println("Them "+deptName+" thanh cong");
        }
    }

    public boolean isDepartmentIDExists(String ID) throws SQLException {
        String isDepartmentIDExists = "Select * from Department where departmentid = ?;";
        PreparedStatement statement = connection.prepareStatement(isDepartmentIDExists);
        statement.setString(1, ID);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }

    public void updateDepartmentName(int id,String Name) throws SQLException {
        String updateDept ="update department set departmentname=? where departmentid = ?;";
        PreparedStatement statement = connection.prepareStatement(updateDept);
        statement.setString(1,Name);
        statement.setString(2, String.valueOf(id));
        if (isDepartmentIDExists(String.valueOf(id))){
            if(isDepartmentNameExists(Name)){
                System.out.println("Department Name is exist !");
            }
            else {
                statement.executeUpdate();
                System.out.println("update thanh cong ");
            }
        }
        else
            System.out.println("Khong tim thay id nay");


    }

    public void deleteDepartmentUsingProcedure(int id) throws SQLException{
        String callProcedure ="call sp_delete_department(?);";
        PreparedStatement statement = connection.prepareStatement(callProcedure);
        statement.setString(1,String.valueOf(id));
        if(isDepartmentIDExists(String.valueOf(id))){

            statement.executeUpdate();
            System.out.println("delete thanh cong");
        }
        else
            System.out.println("ID khong co");
    }




}




