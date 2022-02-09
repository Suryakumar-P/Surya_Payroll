package com.myfss.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.ServerPreparedQueryTestcaseGenerator;

public class MainMenu {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String choice;
		boolean condition=false;
		
		
		//Login-Logout Menu
		do {
		System.out.println("Would you like to login as an Admin(A) or Employee(E)?Please enter your choice");
		choice =sc.nextLine();
		switch (choice) {
		case "A":
		case "a":
			//enter your Admin login function|| condition=Adminloginmethod();
			break;
		case "E":
		case "e":
			//enter your employee login function || condition=EmployeeLoginMethod();
		default:
			System.out.println("Invalid choice. Please enter again");
			break;
		}
		if(condition) {
			System.out.println("Login failed. Please try again");
		}
		}while(!condition);
		
		
		condition=true;
		//Admin menu
		if(choice=="A" || choice=="a") {
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
				int c=sc.nextInt();
				sc.nextLine();
				switch (c) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					condition=GeneratePayslip.createPayslip();
					break;
				case 7:
					break;
				case 0:
					System.out.println("Program exited");
					System.exit(0);
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
		else if(choice=="E"||choice=="e") {
			while(true) {
				System.out.println("----------Hi Employee----------");
				System.out.println("Enter the task you wanted to do:");
				System.out.println("1.View Employee");
				System.out.println("2.Update the Employee");
				System.out.println("3.View Payslip");
				System.out.println("0.Exit");
				int c=sc.nextInt();
				sc.nextLine();
				switch (c) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					System.out.println("Program exited");
					System.exit(0);
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
