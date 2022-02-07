package com.myfss.ui;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.myfss.Beans.Employee;

public class Addemployee{
public static void employeeadd(int id, String firstName,String lastName,String phoneNumber,String email,String dob,String address)
{
	Employee e1 = new Employee(id,firstName,lastName,phoneNumber,email,dob,address);
	//Adding the details of employee object into array list
	ArrayList<Employee> list1 = new ArrayList<Employee>();
	list1.add(e1);
	System.out.println("The Employee details are added successfully.");
	System.out.println("The added deta1ils are displayed below");
	//The added details are displayed
	System.out.println(list1);
}
public static void main(String args[]) throws NumberFormatException, IOException, ParseException
{
//To handle exceptions
    int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String address;
	String dob;
	int choice;
	Scanner s = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Hi Administrator!!");
	System.out.println("Enter the task you wanted to do:");
	System.out.println("1.Add Employee");
	System.out.println("2.Delete Employee");
	System.out.println("3.Search Employee");
	choice = s.nextInt();
	//try{
	switch(choice)
	{
	case 1: System.out.println("You have chosen to add employee");
			System.out.println("Enter the user id:");
			employeeId = Integer.parseInt(br.readLine());
			System.out.println("Enter the firstName of employee:");
			firstName = br.readLine();
			System.out.println("Enter the lastName of employee:");
			lastName = br.readLine();
			System.out.println("Enter the Employee email id:");
			email = br.readLine();
			System.out.println("Enter the Employee phone Number:");
			phoneNumber = br.readLine();
			System.out.println("Enter the Employee date of birth in dd/MM/yyyy format:");
			dob = br.readLine();
		    System.out.println("Enter the address of employee:");
			address = br.readLine();
			employeeadd(employeeId,firstName,lastName,phoneNumber,email,dob,address);
	 default:	System.exit(0);
	}
	}
	/*catch(Exception e)
	{
		System.out.println("Enter the correct data in correct format");
	}*/

}
//}
