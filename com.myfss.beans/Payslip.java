package com.myfss.beans;


/////Task T2- Surya


public class Payslip{
	private float totalPay;
	private float basicPay;
	private float pfDeducted;
	private float taxDeducted;
	private float overtimePay;
	private float allowances;
	private float hourPay;
	private String monthOfPay;
	public Payslip(float totalPay, float basicPay, float pfDeducted, float taxDeducted, float overtimePay,
			float allowances, float hourPay, String monthOfPay) {
		super();
		this.totalPay = totalPay;
		this.basicPay = basicPay;
		this.pfDeducted = pfDeducted;
		this.taxDeducted = taxDeducted;
		this.overtimePay = overtimePay;
		this.allowances = allowances;
		this.hourPay = hourPay;
		this.monthOfPay = monthOfPay;
	}
	
	public Payslip() {}

	public float getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(float totalPay) {
		this.totalPay = totalPay;
	}

	public float getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(float basicPay) {
		this.basicPay = basicPay;
	}

	public float getPfDeducted() {
		return pfDeducted;
	}

	public void setPfDeducted(float pfDeducted) {
		this.pfDeducted = pfDeducted;
	}

	public float getTaxDeducted() {
		return taxDeducted;
	}

	public void setTaxDeducted(float taxDeducted) {
		this.taxDeducted = taxDeducted;
	}

	public float getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(float overtimePay) {
		this.overtimePay = overtimePay;
	}

	public float getAllowances() {
		return allowances;
	}

	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}

	public float getHourPay() {
		return hourPay;
	}

	public void setHourPay(float hourPay) {
		this.hourPay = hourPay;
	}

	public String getMonthOfPay() {
		return monthOfPay;
	}

	public void setMonthOfPay(String monthOfPay) {
		this.monthOfPay = monthOfPay;
	}

	@Override
	public String toString() {
		return "Payslip [totalPay=" + totalPay + ", basicPay=" + basicPay + ", pfDeducted=" + pfDeducted
				+ ", taxDeducted=" + taxDeducted + ", overtimePay=" + overtimePay + ", allowances=" + allowances
				+ ", hourPay=" + hourPay + ", monthOfPay=" + monthOfPay + "]";
	}
	
	

}

