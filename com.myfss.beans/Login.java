package com.myfss.Beans;

public class Login {
	private String username;
	private String password;
	private String account;
	private String EID;
	
	public Login(String username, String password, String account, String eID) {
		super();
		this.username = username;
		this.password = password;
		this.account = account;
		EID = eID;
	}
	public Login()
	{}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsAdmin() {
		return account;
	}
	public void setIsAdmin(String isAdmin) {
		this.account = isAdmin;
	}
	public String getEID() {
		return EID;
	}
	public void setEID(String eID) {
		EID = eID;
	}
	
	
}
