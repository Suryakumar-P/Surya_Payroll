package com.myfss.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;
import com.myfss.beans.Login;


//////////Task T18- Surya



public class MainMenu {
	static BufferedReader br;
	public static void main(String[] args) throws IOException, SQLException {
		boolean condition=false;	
		Login login=null;
		int c=-1;
		//Login-Logout Menu
		while(!condition){
		System.out.println("Enter the task you wanted to do:");
		System.out.println("1.Log in");
		System.out.println("2.Sign in");
		System.out.println("0.Exit");
		br = new BufferedReader(new InputStreamReader(System.in));
		c =Integer.parseInt(br.readLine());
		switch (c) {
		case 1:
			login=Admin.Adminloginmethod();
			if(login!=null)
				condition=true;
			break;
		case 2:
			condition=Admin.createloginmethod();
			break;
		case 0:
			System.out.println("Program exited");
			return;
		default:
			System.out.println("Invalid choice. Please enter again");
			break;
		}
		if(!condition) {
			System.out.println("Login failed. Please try again");
		}
		}
		
		
		condition=true;
		System.out.println(login.getAccount().equals("Admin"));
		//Admin menu
		if(login!=null && login.getAccount().equals("Admin")) {
			System.out.println("Println");
		while(true){
			 {
				System.out.println("----------Hi Administrator----------");
				System.out.println("Enter the task you wanted to do:");
				System.out.println("1.Add Employee");
				System.out.println("2.Delete Employee");
				System.out.println("3.Search Employee");
				System.out.println("4.View Employee");
				System.out.println("5.Update the Employee");
				System.out.println("6.Generate Payslip");
				System.out.println("7.Enter working hours");
				System.out.println("0.Exit");
				br = new BufferedReader(new InputStreamReader(System.in));
				c =Integer.parseInt(br.readLine());
				switch (c) {
				case 1:
					condition=Employeeoperations.addEmployee();
					break;
				case 2:
					condition=Employeeoperations.deleteEmployee();
					break;
				case 3:
					condition=Employeeoperations.searchEmployee();
					break;
				case 4:
					condition=Viewemployee.Viewemployeedetails();
					break;
				case 5:
					condition=Updateprofile.Updateprofiledetails();
					break;
				case 6:
					condition=GeneratePayslip.createPayslip();
					break;
				case 7:
					condition=DbWorkinghours.workingHours();
					break;
				case 0:
					System.out.println("Program exited");
					return;
				default:
					System.out.println("Invalid choice try again");
					break;
				}
				if(!condition) {
					System.out.println("Task failed try again");
				}
			}
			}
		}
		
		//Employee Menu
		else if(login!=null && login.getAccount().equals("Employee")) {
			while(true) {
				System.out.println("----------Hi Employee----------");
				System.out.println("Enter the task you wanted to do:");
				System.out.println("1.View Employee");
				System.out.println("2.Update the Employee");
				System.out.println("3.View Payslip");
				System.out.println("0.Exit");
				br = new BufferedReader(new InputStreamReader(System.in));
				c =Integer.parseInt(br.readLine());
				switch (c) {
				case 1:
					condition=DbEmployeeView.viewEmp();
					break;
				case 2:
					condition=EmpUpdate.updateEmp();
					break;
				case 3:
					condition=ViewPayslip.viewPayslip();
					break;
				case 0:
					System.out.println("Program exited");
					return;
				default:
					System.out.println("Invalid choice try again");
					break;
				}
				if(!condition) {
					System.out.println("Task failed try again");
				}
			}
		}
		
		
		
	}

}
