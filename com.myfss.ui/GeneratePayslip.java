package com.myfss.ui;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.myfss.DAO.EmployeeDAO;
import com.myfss.beans.EmployeePayDetails;
import com.myfss.beans.EmployeePayStandard;
import com.myfss.beans.Payslip;


////Taks T16-Surya


public class GeneratePayslip {
		public static boolean createPayslip() throws SQLException, ParseException {
			//get input of date and Employee id
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the employee Id of the person you want to generate payslip:");
			String eId= sc.nextLine();
			Pattern p = Pattern.compile("[E][0-9]{3}");
			Matcher m = p.matcher(eId);  
			if(!m.matches()) {
				System.out.println("Employee id is invalid");
				return false;
			}
			System.out.println("Enter the date of the payslip generation");
			String dateString=sc.nextLine();
			DateFormat formatter;
		    Date date,dateMin,dateMax;
		    formatter = new SimpleDateFormat("MM/yyyy");
		    date = (Date) formatter.parse(dateString);
		    dateMin = (Date) formatter.parse("01/2000");
		    dateMax=(Date) formatter.parse("02/2022");
		    if(!(date.after(dateMin) && date.before(dateMax))) {
		    	System.out.println("Invalid date. Please select a date between 01/2000 to 02/2022");
		    	return false;
		    }
			
			Payslip exist=EmployeeDAO.viewPaySlip(eId, dateString);
			if(exist.getMonthOfPay()!=null) {
				System.out.println("Entry Already exists. Try again");
				return false;
			}
			
			//Get employeestandard and details from query
			EmployeePayStandard std=EmployeeDAO.viewEmployeePay(eId);
			EmployeePayDetails details=EmployeeDAO.viewEmployeePayApplied(eId,dateString);
			if(std.getEmployeeGrade()==null || details.getMonthOfApplication()==null) {
				System.out.println("No entry found for the person you have entered or the month");
				return false;
			}
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
			System.out.println("Payslip generated. Thank you.");
			return true;
		}
		
		public static void main(String args[]) throws SQLException, ParseException {
			createPayslip();
		}
}
