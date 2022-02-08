package Payroll;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Admin {
	static void update(String name,String pwd)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new user name");
		String newname=sc.nextLine();
		System.out.println("enter new password");
		String passwd=sc.nextLine();
	    try 
	    {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Welcome@123");
		    PreparedStatement stmt=con.prepareStatement("update par set username=?,pwd=? where username=? ");
		    stmt.setString(1,newname);
			stmt.setString(2,passwd);
			stmt.setString(3, name);
			stmt.executeUpdate();
	        con.close();
	        System.out.println("Profile updated");
		
	    }
	    catch(Exception e) 
	    {
	    	System.out.println(e);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter user name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("enter password");
		String pwd=sc.nextLine();
		int flag=0;
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Welcome@123");
	    PreparedStatement ps=con.prepareStatement("select * from par where username=? and pwd=?");
	    ps.setString(1, name);
	    ps.setString(2,pwd);
	    String n="",p="";
	    ResultSet rs=ps.executeQuery();
	    while(rs.next())
	    {
	    	System.out.println(rs.getString(2));
	    if(rs.getString(1).equals(name) && rs.getString(2).equals(pwd)) {
	          flag=1;
	          
	    }
	    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(flag==1)
		{
	 	System.out.println("Enter 1 for view profile");
		System.out.println("Enter 2 for update profile");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			String s="";
			int i=0;
			while(i!=pwd.length())
			{
				s+="*";
				i++;
			}
			System.out.println("Name:"+name+"   "+"password:"+s);
			break;
		case 2:
			
			update(name,pwd);
			break;
		default:
			System.out.println("Enter valid key");
		}
		}
		 else System.out.println("Invalid name and  password");
		
	}

}
