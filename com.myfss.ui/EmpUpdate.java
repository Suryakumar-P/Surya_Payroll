package FSS.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpUpdate {

	
	//Drivers name
	 static final String DB_URL = "jdbc:mysql://localhost:3306";
	   static final String USER = "root";
	   static final String PASS = "abcd";
	   static final String QUERY = "SELECT * FROM project.employeeview";
	   public static void main(String[] args) {

		   try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
		      ) {
			   String query2="update project.employeeview set empemail='gopal@gmail.com' where empid=11 ";
			   stmt.executeUpdate(query2);
			   ResultSet rs = stmt.executeQuery(QUERY);
				 //Output 
				System.out.println("Data inserted");
			} catch ( SQLException e) {
				
				e.printStackTrace();
			}
			

		}
		   }

