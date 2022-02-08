package com.myfss.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.myfss.Beans.EmployeePayDetails;
import com.myfss.Beans.EmployeePayStandard;
import com.myfss.Beans.Payslip;
import com.myfss.DAO.EmployeeDAO;

public class GeneratePayslip {
		public static void createPayslip() throws SQLException {
			//get input of date and Employee id
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the employee Id of the person you want to generate payslip:");
			String eId= sc.nextLine();
			System.out.println("Enter the date of the payslip generation");
			String dateString=sc.nextLine();
			
			//Get employeestandard and details from query
			EmployeePayStandard std=EmployeeDAO.viewEmployeePay(eId);
			EmployeePayDetails details=EmployeeDAO.viewEmployeePayApplied(eId,dateString);
			
			//create new payslip and calculate from the above two values
			Payslip pay=new Payslip();
			pay.setBasicPay(std.getBasicPay());
			pay.setHourPay(std.getHourPay()*details.getHoursWorked());
			pay.setOvertimePay(std.getOvertimePay()*details.getOvertimeHours());
			float allowance= std.getAllowances()<details.getAllowanceApplied() ? std.getAllowances():details.getAllowanceApplied();
			pay.setAllowances(allowance);
			pay.setMonthOfPay(details.getMonthOfApplication());
			float bfrDeductions=pay.getBasicPay()+pay.getHourPay()+pay.getOvertimePay()+pay.getAllowances();
			pay.setPfDeducted(bfrDeductions*std.getPfPercentage()/100);
			pay.setTaxDeducted(bfrDeductions*std.getTaxPercantage()/100);
			float total=bfrDeductions-pay.getPfDeducted()-pay.getTaxDeducted();
			pay.setTotalPay(total);
			
			//Insert the calculated values
			EmployeeDAO.insertPayslip(pay, eId);
		}
		
//		public static void main(String args[]) throws SQLException {
//			createPayslip();
//		}
}
