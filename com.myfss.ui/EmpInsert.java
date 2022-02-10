
package FSS.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpInsert {

	
		//Drivers name
		 static final String DB_URL = "jdbc:mysql://localhost:3306";
		   static final String USER = "root";
		   static final String PASS = "abcd";
		   static final String QUERY = "SELECT * FROM project.employeeview";
		   public static void main(String[] args) {
	
			   try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
			      ) {
			//inserting values into Records
				   
			String query1="insert into project.employeeview values(10,'John','john@gmail.com',55000,8957303528)";
			
			//Executing query
			stmt.executeUpdate(query1);
		  
			 ResultSet rs = stmt.executeQuery(QUERY);
			 //Output 
			System.out.println("Data inserted");
		} catch ( SQLException e) {
			
			e.printStackTrace();
		}
		

	}
	}


