package com.vastika.dailysalesrecord.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static final String URL = "jdbc:mysqi://localhost:3306/sales_record_db?useSSL=false&serverTimezone=CST";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String DRIVER = "com.mysql.jdbc.Driver";
			
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);		
	}
}
