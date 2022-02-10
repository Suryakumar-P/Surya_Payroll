package com.MyFSS.beans;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 
		try  
		        {  
		            
		            LoginForm form = new LoginForm();  
		            form.setSize(350,300);   
		            form.setVisible(true); 
		        }  
        catch(Exception e)  
        {       
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
 
	}


