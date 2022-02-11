package FSS.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// Methods for Updation
public class  EmployeeUpdate {

	//Drivers name
	 static final String DB_URL = "jdbc:mysql://localhost:3306";
	   static final String USER = "root";
	   static final String PASS = "abcd";
	   static final String QUERY = "SELECT * FROM project.employeeview";
	 
	   public boolean updateEmployee() { 
		   try 
		   (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
		      ) {
			   //Execution Database
			   String query1="Delete from project.employeeview where Empname='gopi'";
			   String query2="Update project.employeeview set empid=16 where empname='sairam' ";
			   stmt.executeUpdate(query2);
			   stmt.executeUpdate(query1);
			   ResultSet rs = stmt.executeQuery(QUERY);
				 //Database Output 
				System.out.println("Data inserted");
			} catch ( SQLException e) {
				
				e.printStackTrace();
			}
		   return true;
			
	   } 
		
	   public static void main(String[] args) {
		   EmployeeUpdate e=new EmployeeUpdate();
		   e.updateEmployee();
	   }
	   
		   }

