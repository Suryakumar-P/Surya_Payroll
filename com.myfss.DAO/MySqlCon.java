package com.myfss.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {

	public static Connection conn;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_system","root","password");
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	public static ResultSet select(String query) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeQuery(query);
	}
	
	public static int execueDML(String query) throws SQLException {
		PreparedStatement statement = conn.prepareStatement(query);
		return statement.executeUpdate();
	}
	

}
