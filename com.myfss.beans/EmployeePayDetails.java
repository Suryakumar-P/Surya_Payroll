package com.myfss.Beans;

public class EmployeePayDetails {
	private float hoursWorked;
	private float overtimeHours;
	private float allowanceApplied;
	private String monthOfApplication;
	public EmployeePayDetails(float hoursWorked, float overtimeHours, float allowanceApplied,
			String monthOfApplication) {
		super();
		this.hoursWorked = hoursWorked;
		this.overtimeHours = overtimeHours;
		this.allowanceApplied = allowanceApplied;
		this.monthOfApplication = monthOfApplication;
	}
	
	public EmployeePayDetails() {}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public float getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(float overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public float getAllowanceApplied() {
		return allowanceApplied;
	}

	public void setAllowanceApplied(float allowanceApplied) {
		this.allowanceApplied = allowanceApplied;
	}

	public String getMonthOfApplication() {
		return monthOfApplication;
	}

	public void setMonthOfApplication(String monthOfApplication) {
		this.monthOfApplication = monthOfApplication;
	}
	
	
	
}
