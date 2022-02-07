package com.myfss.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myfss.Beans.Employee;
import com.myfss.Beans.Login;

public class EmployeeDAO {

	public static int deleteEmp(String EID) throws SQLException {
		String query=String.format("DELETE FROM login_details where id='%s'",EID);
		return MySqlCon.execueDML(query);
	}

	public static int insertEmp(Employee emp) throws SQLException {
		String query=String.format
				("insert into user_personal_details(firstname,lastname,phone,email,dob,login_id,position,doj,employee_grade,team,company_name) values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')", 
						emp.getFirstName(),emp.getLastName(),emp.getPhoneNumber(),emp.getEmail(),emp.getDob(),
						emp.getEmployeeId(),emp.getPosition(),emp.getDoj(),emp.getEmployeeGrade(),emp.getTeam(),emp.getCompanyName());	
		return MySqlCon.execueDML(query);
	}
	
	public static Login passwordVerification(String EID) throws SQLException {
		String query =String.format("select * from login_details where id='%s'",EID);
		ResultSet result=MySqlCon.select(query);
		while(result.next()) {
			return new Login(result.getString("username"),result.getString("password"),result.getString("account_type"),result.getString("id"));
		}
		return new Login();
	}
	
	public static Employee viewEmployee(String EID) throws SQLException {
		String query=String.format("select *from employee_personal_details where login_id='%s'",EID);
		ResultSet result=MySqlCon.select(query);
		while(result.next()) {
		return new Employee(result.getString("login_id"),result.getString("firstname"),result.getString("lastname"),result.getString("email_address"),result.getString("phone"),result.getString("dob"),result.getString("position"),result.getString("doj"),result.getString("employee_grade"),result.getString("team"),result.getString("comapny_name"));
		}
		return new Employee();
	}
	
	public static int updateEmp(Employee emp) throws SQLException {
		String query=String.format("update user_personal_details set firstname='%s',lastname='%s',phone='%s',email='%s',dob='%s',position='%s',doj='%s',employee_grade='%s',team='%s',company_name='%s' where login_id='%s'", emp.getFirstName(),emp.getLastName(),emp.getPhoneNumber(),emp.getEmail(),emp.getDob(),
						emp.getPosition(),emp.getDoj(),emp.getEmployeeGrade(),emp.getTeam(),emp.getCompanyName(),emp.getEmployeeId());
		return MySqlCon.execueDML(query);
	}
	
	
}
