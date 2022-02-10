import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.myfss.beans.Employee;

public class Employeeoperations{
	Employee[] e1 = new Employee[100];
public static boolean addEmployee()  //Method for adding employee
{	try             //To handle Exceptions
	{
	String employeeId;     //Declaring the data for adding employees
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
	int noofemp;  // variable to add more than one employee
 	System.out.println("Enter the number of employees to be added:");
	noofemp = Integer.parseInt(br.readLine());
 	int res;
	ArrayList<Employee> list1 = new ArrayList<Employee>();    // creating arraylist to store the data as employee object type.
	System.out.println("Enter the Employee id:");             // Getting input from the employee
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

	for(int i=0;i<noofemp;i++)
	{
	e1[i] = new Employee(employeeId,firstName,lastName,email,phone,date,position,doj,employee_grade,team,company_name);  //assigning values to employee object
	list1.add(e1[i]);			// adding employee object into list.
	res=EmployeeDAO.insertEmp(list1);	//checking whether the data is added or not.
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
	br.close();
	return true;
}
 catch(Exception e)
 {
	 System.out.println(e);
 }
}
public static boolean deleteEmployee throws IOException()
{	try
	{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String employeeId;
	system.out.println("You have chosen to delete employee details.");
	System.out.println("Enter the employee id to be deleted");
	employeeId = br.readLine();
	int res1;
	char ch;
	Employee ee = new Employee();
	ee = EmployeeDAO.viewEmployee(employeeId); //assigning the returned employee object to another employee object
	if(ee==null)       // checking whether the employee object is null
	{
		System.out.println("Invalid employee id");
		return false;
	}
	else
	{
	System.out.println("The employee details are:");
	System.out.println(ee);
	System.out.println("Do you want to delete this employee details(Y/N)?");
	ch = br.readLine();
	if(ch=='Y'||ch=='y') // If the user accepts to delete the data 
	{
	res1 = EmployeeDAO.deleteEmp(employeeId);
	if(res1>0)
	{
	System.out.println("Details deleted Successfully.");
	return true;
	}
	else
	{
	System.out.println("The details are not deleted!! Please try again");
	return false;
	}
	}
	else                                // If the user refuses to delete the data
	{
	System.out.println("You have decided not to delete");
	return false;
	}
	}
	br.close();
}
 catch(Exception e)
 {
	 System.out.println(e);
 }
}
public static boolean searchEmployee throws IOException()
{	
	try
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String employeeId;
	System.out.println("you have chosen to search employee:");
	System.out.println("Enter the employee id to search for the employee:");
	employeeId = br.readLine();
	Employee ee = new Employee();
	ee = EmployeeDAO.viewEmployee(employeeId);        //assigning the returned employee object to another employee object
	if(ee==null)       // checking whether the employee object is null
	{
		System.out.println("Invalid employee id or employee not available");
		return false;
	}
	else
	{
	System.out.println("The employee details are:");
	System.out.println(ee);
	return true;
	}
	br.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void main(String args[]) throws NumberFormatException, IOException
{
	int ch;
	boolean y = "false";
	System.out.println("Enter the operation to be performed:");
	System.out.println("1.Add employee");
	System.out.println("2.Delete employee");
	System.out.println("3.Search employee");
	Scanner s = new Scanner(System.in);
	ch = s.nextInt();
	switch(ch)
	{
	case 1: y = Employeeoperations.addEmployee();
			if(y=true)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Not Entered");
			}
			break;
	case 2: y = Employeeoperations.deleteEmployee();
			if(y=true)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Not Entered");
			}
			break;
	case 3: y=Employeeoperations.searchEmployee();
			if(y=true)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Not Entered");
			}
			break;
	default: break;
	}
}
}
