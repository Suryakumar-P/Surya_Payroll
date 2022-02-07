package com.myfss.Beans;


public class Login {
	private String username;
	private String password;
	private Boolean isAdmin;
	private String EID;
	
	public Login(String username, String password, Boolean isAdmin, String eID) {
		super();
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
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
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getEID() {
		return EID;
	}
	public void setEID(String eID) {
		EID = eID;
	}
	
	
}
