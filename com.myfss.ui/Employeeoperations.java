import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.myfss.beans.Employee;

public class Employeeoperations{
	Employee[] e1 = new Employee[100];
public void addEmployee(String employeeId,String firstName,String lastName,String email,String phone,String date,String position,String doj,String employee_grade,String team,String company_name,)
{	String employeeId;
	String firstName;
	String lastName;
	String email;
	String phone;
	String date;
	String login_id;
	String position;
	String doj;
	String employee_grade;
	String team;
	String company_name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Hi Administrator!!");
	int noofemp;
 	System.out.println("Enter the number of employees to be added:");
	noofemp = Integer.parseInt(br.readLine());
 	int res;
	ArrayList<Employee> list1 = new ArrayList<Employee>();
	for(int i=0;i<noofemp;i++)
	{
	e1[i] = new Employee(employeeId,firstName,lastName,email,phone,date,position,doj,employee_grade,team,company_name);
	list1.add(e1[i]);
	res=EmployeeDAO.insertEmp(list1);
	if(res>0)
	{
	System.out.println("The Employee details are added successfully.");
	}
	else
	{
	System.out.println("The Employee details are not added!! Try again");
	return 0;
	}
	}
	System.out.println("The added deta1ils are displayed below");
	//The added details are displayed
	System.out.println(list1);
}
public void deleteEmployee(String employeeId)
{
	int res1;
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
	System.out.println("Do you want to delete this employee details(Y/N)?");
	scanner s = new scanner(System.in);
	s = ch.next();
	if(ch=='Y'||ch=='y')
	{
	res1 = EmployeeDAO.deleteEmp(employeeId);
	if(res1>0)
	{
	System.out.println("Details deleted Successfully.");
	}
	else
	{
	System.out.println("The details are not deleted!! Please try again");
	}
	}
	else
	{
	System.out.println("You have decided not to delete");
	return 0;
	}
	}
}
public void searchEmployee(String employeeId)
{
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
	}
}
public static void main(String args[]) throws NumberFormatException, IOException
{
//To handle exceptions
    	//Adding the details of employee object into array list
	
	//try
	switch(choice)
	{
	case 1: System.out.println("Enter the number of employees to be added");
			noofemp=Integer.parseInt(br.readLine());
			for(int i=0;i<noofemp;i++)
			{
			System.out.println("You have chosen to add employee");
			System.out.println("Enter the Employee id:");
			employeeId = br.readLine();
			System.out.println("Enter the firstName of employee:");
			firstName = br.readLine();
			System.out.println("Enter the lastName of employee:");
			lastName = br.readLine();
			System.out.println("Enter the Employee email id:");
			email = br.readLine();
			System.out.println("Enter the Employee phone Number:");
			phone = br.readLine();
			System.out.println("Enter the date in dd/MM/yyyy format:");
			date = br.readLine();
		    System.out.println("Enter the Login id of employee:");
		    login_id = br.readLine();
		    System.out.println("Enter the position of employee:");
		    position = br.readLine();
		    System.out.println("Enter the date of joining of employee in dd/mm/yyyy format:");
		    doj = br.readLine();
		    System.out.println("Enter the grade of the employee:");
		    employee_grade = br.readLine();
		    System.out.println("Enter the team of the employee:");
		    team = br.readLine();
		    System.out.println("Enter the company name of the employee:");
		    company_name = br.readLine();
			addEmployee(employeeId,firstName,lastName,email,phone,date,position,doj,employee_grade,team,company_name);
			}
	case 2: system.out.println("You have chosen to delete employee details.");
			System.out.println("Enter the employee id to be deleted");
			employeeId = br.readLine();
			deleteEmployee(employeeId);
	case 3: System.out.println("you have chosen to search employee:");
			System.out.println("Enter the employee id to search for the employee:");
			employeeId = br.readLine();
			searchEmployee(employeeId);
	 default:	System.exit(0);
	}
	}
	catch(Exception e)
	{
		System.out.println("Enter the correct data in correct format");
	}

}
}
