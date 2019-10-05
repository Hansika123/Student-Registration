package com.db;

import java.sql.*;

public class dbCreate {
	
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/student_registration";
	final String USER = "root";
	final String PASS = "";
	Connection con = null;
	Statement stmt = null;
	public void insertdata(String index, String name, String email,int telno){
		Connection con = null;
		Statement stmt = null;
		try {
		Class.forName(JDBC_DRIVER);
		try {
		System.out.println("Connecting to Database...");
		con = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Creating Statement...");
		stmt = con.createStatement();
		System.out.println("Executing SQL...");
		String sql = "insert into students values('"+index+"','"+name+"','"+telno+"','"+email+"')";
		stmt.executeUpdate(sql);
		System.out.println("Data Inserted Successfully...");
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (null != stmt) {
		stmt.close();
		}
		if (null != con) {
		con.close();
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
	}
	
	public void createTable() {
		Connection con = null;
		Statement stmt = null;
		try {
		Class.forName(JDBC_DRIVER);
		try {
		System.out.println("Connecting to Database...");
		con = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Creating Statement...");
		stmt = con.createStatement();
		System.out.println("Executing SQL...");
		String sql = "CREATE TABLE IF NOT EXISTS STUDENTS"
		+ "(indexNo varchar(10) not NULL, "
		+ " name VARCHAR(100), "
		+ " telNo int(10), "
		+ " email VARCHAR(100), "
		+ " PRIMARY KEY ( indexNo ))";
		stmt.executeUpdate(sql);
		System.out.println("Table Created Successfully...");
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (null != stmt) {
		stmt.close();
		}
		if (null != con) {
		con.close();
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		}
}
