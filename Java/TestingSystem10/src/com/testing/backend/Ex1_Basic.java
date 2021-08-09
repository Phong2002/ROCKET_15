package com.testing.backend;

import java.sql.*;
import java.util.Scanner;

public class Ex1_Basic {
    String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem";
    String username = "root";
    String password = "030502";
    public void question1() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Connection Successfully !");
    }
    public void question2() throws SQLException {
        Ex1_Basic ex1 = new Ex1_Basic();
        ex1.printPos();
    }
    public void printPos() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Connection Successfully !");

        Statement statement = connection.createStatement();
        String q2="SELECT * FROM testingsystem.position;";
        ResultSet resultSet = statement.executeQuery(q2);

        while (resultSet.next()){
            System.out.printf(String.format(resultSet.getString(1)+"%20s",resultSet.getString(2))+"\n");
        }
    }

    public void question3() throws SQLException {
        addPos();
    }

    public void addPos() throws SQLException{
        Scanner sc= new Scanner(System.in);
        Connection connection = DriverManager.getConnection(dbUrl,username,password);
        String q3 ="insert into position (positionname) values (?);";
        PreparedStatement preSta = connection.prepareStatement(q3);
        preSta.setString(1,sc.nextLine());
        int effectedRecodAmount = preSta.executeUpdate();
        System.out.println("So cot bi anh huong : "+effectedRecodAmount);
    }
    public void question4() throws SQLException{
        updatePos();
    }
    public void updatePos() throws SQLException{
        Connection connection = DriverManager.getConnection(dbUrl,username,password);
        String q4 ="UPDATE position SET positionname = 'DEV'WHERE positionid = 5;";
        PreparedStatement preSta = connection.prepareStatement(q4);
        int effRecodAmount = preSta.executeUpdate();
        System.out.println("So dong bi anh huong "+effRecodAmount);
    }

    public void question5()throws SQLException{
        deletePos();
    }

    public void deletePos() throws SQLException{
        Scanner sc= new Scanner(System.in);
        Connection connection = DriverManager.getConnection(dbUrl,username,password);
        String q4 ="delete from position where positionid =?;";
        PreparedStatement preSta = connection.prepareStatement(q4);
        System.out.println("Nhap ID cua Pos muon xoa :");
        preSta.setString(1,sc.nextLine());
        int effRecodAmount = preSta.executeUpdate();
        System.out.println("So dong bi anh huong "+effRecodAmount);
    }

}
