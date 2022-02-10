package FSS.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class  EmpUpdate {

	//Drivers name
	 static final String DB_URL = "jdbc:mysql://localhost:3306";
	   static final String USER = "root";
	   static final String PASS = "abcd";
	   static final String QUERY = "SELECT * FROM project.employeeview";
	 
	   {
		   try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
		      ) {
			   String query1="Delete from project.employeeview where Empname='gopi'";
			   String query2="Update project.employeeview set empid=16 where empname='sairam' ";
			   stmt.executeUpdate(query2);
			   stmt.executeUpdate(query1);
			   ResultSet rs = stmt.executeQuery(QUERY);
				 //Output 
				System.out.println("Data inserted");
			} catch ( SQLException e) {
				
				e.printStackTrace();
			}
			
		   
		}
	   public static void main(String[] args) {
		   EmpUpdate e=new EmpUpdate();
	   }
	   
		   }

