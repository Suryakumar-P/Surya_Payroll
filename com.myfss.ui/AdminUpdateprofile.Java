package com.myfss.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.myfss.DAO.EmployeeDAO;
import com.myfss.beans.Employee;

public class Updateprofile {
	public static boolean Updateprofiledetails() throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String employeeId;
		System.out.println("Enter the employee id");
		employeeId = br.readLine();
		char ch;
		Employee ee = new Employee();
		ee = EmployeeDAO.viewEmployee(employeeId);
		if(ee==null)
		{
			System.out.println("Invalid employee id");
		}
		else
		{
	   	System.out.println("The employee details are:");
	  	System.out.println(ee);
	  	System.out.println("Enter the Employee id:");
		  employeeId = br.readLine();
	  	System.out.println("Enter the firstName of employee:");
		  String firstName = br.readLine();
		  System.out.println("Enter the lastName of employee:");
		  String lastName = br.readLine();
		  System.out.println("Enter the Employee email id:");
		  String email = br.readLine();
		  System.out.println("Enter the Employee phone Number:");
	  	String phone = br.readLine();
		  System.out.println("Enter the date in dd/MM/yyyy format:");
		  String date = br.readLine();
	    System.out.println("Enter the position of employee:");
	    String position = br.readLine();
	    System.out.println("Enter the date of joining of employee in dd/mm/yyyy format:");
	    String doj = br.readLine();
	    System.out.println("Enter the grade of the employee:");
	    String employee_grade = br.readLine();
	    System.out.println("Enter the team of the employee:");
	    String team = br.readLine();
	    System.out.println("Enter the company name of the employee:");
	    String company_name = br.readLine();
	    Employee e1;
		e1 = new Employee(employeeId,firstName,lastName,email,phone,date,position,doj,employee_grade,team,company_name);
		Object emp = EmployeeDAO.updateEmp(e1);
		}
		return false;
		}
	}
