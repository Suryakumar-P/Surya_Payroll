import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.myfss.Beans.*;

public class ViewPayslip {

	/**
	 * @param args
	 */public static void viewPayslip()
	 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String employeeId;
		System.out.println("Enter the Employee ID to view the payslip:");
		employeeId = br.readLine();
		 Employee e = EmployeeDAO.viewEmployee(employee);
			if((e.getEmployeeId).equals(employeeId))
			{
			Payslip p = EmployeeDAO.viewPaySlip(employeeId);
			System.out.println(p);
			}
			else
			{
				System.out.println("The employee Id is invalid. Please Enter a valid Employee Id.");
			}	 
	 }
	
	public static void main(String[] args) {
		
	}
}
