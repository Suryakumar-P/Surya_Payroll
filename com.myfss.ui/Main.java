package com.MyFSS.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		 
		try  
		        {  
			
		            LoginDemo form = new LoginDemo();  
		            form.setSize(350,300);   
		            form.setVisible(true); 
		            
		        }  
        catch(Exception e)  
        {       
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
 
	}


