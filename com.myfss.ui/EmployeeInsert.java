
package FSS.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.MyFSS.beans.EmpBeans;

public class EmployeeInsert {

	 static final String DB_URL = "jdbc:mysql://localhost:3306";
	   static final String USER = "root";
	   static final String PASS = "abcd";
	   static final String QUERY = "SELECT * FROM project.employeeview";
	
	   
	   public boolean insertEmployee() {
		   try {

			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Connection con=null;
			PreparedStatement ps=null;
			String qry="insert into project.employeeview values(?,?,?,?,?,?,?,?,?) ";
			
			System.out.println("Enter the employee id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter the employee name ");
			String name=br.readLine();
			System.out.println("Enter the employee email ");
			String email=br.readLine();
			System.out.println("Enter the employee Sal ");
			int sal=Integer.parseInt(br.readLine());
			System.out.println("Enter the employee Phone ");
			float Phone=Float.parseFloat(br.readLine());
			System.out.println("Enter the employee Position ");
			String position=br.readLine();
			System.out.println("Enter the employee Grade");
			String grade=br.readLine();
			System.out.println("Enter the employee CompanyName");
			String CompanyName=br.readLine();
			System.out.println("Enter the employee Teams");
			String Teams=br.readLine();
			
			
			String url="jdbc:mysql://localhost:3306";
			String uname="root";
			String password="abcd";
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=(Connection) DriverManager.getConnection(url, uname, password);
				con.setAutoCommit(false);
				ps=(PreparedStatement) con.prepareStatement(qry);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setLong(4, sal);
				ps.setFloat(5, Phone);
				ps.setString(6, position);
				ps.setString(7, grade);
				ps.setString(8,CompanyName);
				ps.setString(9,Teams);
				
				ps.executeUpdate();
				System.out.println("<-----Employee details are added successfully--------->");
				con.commit();
				
				
			} catch (ClassNotFoundException | SQLException | NumberFormatException e) {
			
				
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   return true;

	}
	   public static void main(String[] args) {
		
		EmployeeInsert e=new EmployeeInsert();
		e.insertEmployee();
	}
       
	}


