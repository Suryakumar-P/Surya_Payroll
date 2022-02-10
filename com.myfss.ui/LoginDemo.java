package com.MyFSS.beans;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginDemo extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   LoginDemo() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField(15);
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField(15);
      // Submit
      submit = new JButton("SUBMIT");
     
      panel = new JPanel(new GridLayout(3,1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
     // panel.add(cancel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Employee !");
      setSize(450,350);
      setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      if (userName.trim().equals("Sai") && password.trim().equals("12345")) {
         message.setText(" Hello " + userName + "");
         System.out.println("Successful login");
      } else {
         message.setText(" Invalid user.. ");
      }
      System.out.println("Please enter valid username and password");
   }
}