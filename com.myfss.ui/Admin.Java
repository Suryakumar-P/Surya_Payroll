package com.myfss.ui;

import java.sql.SQLException;
import java.util.Scanner;
import com.myfss.DAO.EmployeeDAO;
import com.myfss.beans.Login;

public class AdminLogin {
	static EmployeeDAO ed1;

	public static boolean Adminloginmethod() throws SQLException{
		ed1 = new EmployeeDAO();
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the id :");
			String id=s.next();
			System.out.print("Enter the name:");
			String name=s.next();
			System.out.print("Enter the password :");
			String password=s.next();
			System.out.print("Enter the Account type :");
			String account_type=s.next();
			
			
			Login login;
			try {
			//	String id = null;
				login = EmployeeDAO.passwordVerification(id);
				if(login.getUsername()!=null) {
					if(login.getUsername().equals(name) && login.getPassword().equals(password)) {
						return true;
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
		/*if(validation(id,name,password,account_type)) {
	}*/
}
}
