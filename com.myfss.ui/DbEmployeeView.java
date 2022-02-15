package com.myfss.ui;

/////Task T13- Saiguptha
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
import java.sql.SQLException;

	public class DbEmployeeView {
	public static boolean viewEmp () {


	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {


	Class.forName("com.mysql.cj.jdbc.Driver");  
	        String eid,  ename,  eemail,  ephone,  esal,  position,  cname,  grade,  teams;
	        int empId=0,phone=0;
	        float salary=0;

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","abcd");

	PreparedStatement stmt=con.prepareStatement("select * from project.employeeview");
	
	ResultSet rs = stmt.executeQuery();
	System.out.println("Emp Id     Emo_Name     Emp_email     Emp_Salary     Emp_Phone      Emp_Position    Emp_Grade     Emp_CompanyName      Emp_team");
	while(rs.next()) {
			
		String EmployeeDetails="   ";
			for(int i=1 ; i<10 ; i++) {
				EmployeeDetails += rs.getString(i)+ "   :   ";
			}
			System.out.println(  EmployeeDetails  );
		}

	System.out.println(rs.getString(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getString(4)+"     "+rs.getString(5)+"     "+rs.getString(6)+"     "+rs.getString(7)+
			"     "+rs.getString(8)+ "     "+rs.getString(9));
	   

	  
	 
	    System.out.println("<------Employee List Retrieved Successfully----------->");
	  
	   
	}catch(Exception e) {System.out.println(e);
	}
	return true;
	}

	} 


