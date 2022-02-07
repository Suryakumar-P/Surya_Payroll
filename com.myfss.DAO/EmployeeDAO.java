package com.myfss.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myfss.Beans.Employee;
import com.mysql.cj.Query;

public class EmployeeDAO {

	public static int deleteEmp(String EID) throws SQLException {
		String query= "DELETE FROM login_details where id='"+EID+"'";
		return MySqlCon.execueDML(query);
	}

	public static int insertEmp(Employee emp) throws SQLException {
		String query="insert into ";
		return MySqlCon.execueDML(query);
	}
	
	public static String password(String EID,String password) {
		String query = "select password,is_admin from login_details where id'"+EID+"'";
		return query;
	}
	
	
}
