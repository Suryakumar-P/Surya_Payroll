package com.MyFSS.beans;
  
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
	  
	public class LoginForm extends JFrame implements ActionListener {
	    JButton b1;  
	    JPanel newPanel;  
	    JLabel userLabel, passLabel;  
	    final JTextField  textField1, textField2;
		private AbstractButton message;
		private String userName;  
	    LoginForm()  
	    {        
	        userLabel = new JLabel();  
	        userLabel.setText("Username");    
	        textField1 = new JTextField(15);   
	        passLabel = new JLabel();  
	        passLabel.setText("Password");      
	        textField2 = new JPasswordField(15);     
	        b1 = new JButton("SUBMIT");   
	        newPanel = new JPanel(new GridLayout(3, 1));  
	        newPanel.add(userLabel);      
	        newPanel.add(textField1);    
	        newPanel.add(passLabel);      
	        newPanel.add(textField2);    
	        newPanel.add(b1);             
	        add(newPanel, BorderLayout.CENTER);  
	        b1.addActionListener(this);     
	        setTitle("Employee Login");        
	    }  

	    public void actionPerformed(ActionEvent ae)      
	    {  
	        String userValue = textField1.getText();         
	        String passValue = textField2.getText();        
	        if (userValue.equals("17700 ") && passValue.equals("sai ")) {    
	         LoginForm page = new LoginForm();  
	          page.setVisible(true);  
	          JLabel wel_label = new JLabel("Welcome: "+userValue);  
	           page.getContentPane().add(wel_label);
	          message.setText(" Hello " + userName + "");
	        }  
	        else{  
	        	 message.setText(" Invalid user");
	           
	            System.out.println("Please enter valid username and password");  
	        }  
	    }

	
	}  


