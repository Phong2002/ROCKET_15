package com.testing;
import java.sql.SQLException;
import java.sql.*;
public class Main {

		public static void main(String[] args) throws SQLException,ClassNotFoundException {

			String dbUrl = "jdbc:mysql://localhost:3306/employees";
			String username = "root";
			String password = "030502";

			Connection connection = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connection Successfully !");
			Statement statement =connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from departments;");

			while (resultSet.next()){
				System.out.print(resultSet.getString(1)+"         ");
				System.out.println(resultSet.getString(2));

			}
    }}

