package com.myfss.ui;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.myfss.DAO.EmployeeDAO;
import com.myfss.beans.*;

public class ViewPayslip {

	/**
	 * @param args
	 */public static boolean viewPayslip()
	 {
		 try
		 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String employeeId;
		System.out.println("Enter the Employee ID to view the payslip:");
		employeeId = br.readLine();
		System.out.println("Enter the month of the payslip");
		String dateString=br.readLine();       //Getting date and employee id from the employee
		 Employee e = EmployeeDAO.viewEmployee(employeeId); 
		 String emp = e.getEmployeeId();
			if(emp.equalsIgnoreCase(employeeId))  //Checking whether the employee id is valid or not.
			{
			Payslip p = EmployeeDAO.viewPaySlip(employeeId,dateString);
			System.out.println(p);
			br.close();
			return true;
			}
			else
			{
				System.out.println("The employee Id is invalid. Please Enter a valid Employee Id.");
				return false;
			}	 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return false;
	 }
	
	public static void main(String[] args) {
		
	}
}
