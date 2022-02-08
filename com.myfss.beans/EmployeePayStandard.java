package com.myfss.Beans;

public class EmployeePayStandard {
		private String employeeGrade;
		private float basicPay;
		private float taxPercantage;
		private float pfPercentage;
		private float hourPay;
		private float overtimePay;
		private float allowances;
		
		
		public EmployeePayStandard(String employeeGrade, float basicPay, float taxPercantage, float pfPercentage,
				float hourPay, float overtimePay, float allowances) {
			super();
			this.employeeGrade = employeeGrade;
			this.basicPay = basicPay;
			this.taxPercantage = taxPercantage;
			this.pfPercentage = pfPercentage;
			this.hourPay = hourPay;
			this.overtimePay = overtimePay;
			this.allowances = allowances;
		}
		
		public EmployeePayStandard() {}
		
		
		public String getEmployeeGrade() {
			return employeeGrade;
		}
		public void setEmployeeGrade(String employeeGrade) {
			this.employeeGrade = employeeGrade;
		}
		public float getBasicPay() {
			return basicPay;
		}
		public void setBasicPay(float basicPay) {
			this.basicPay = basicPay;
		}
		public float getTaxPercantage() {
			return taxPercantage;
		}
		public void setTaxPercantage(float taxPercantage) {
			this.taxPercantage = taxPercantage;
		}
		public float getPfPercentage() {
			return pfPercentage;
		}
		public void setPfPercentage(float pfPercentage) {
			this.pfPercentage = pfPercentage;
		}
		public float getHourPay() {
			return hourPay;
		}
		public void setHourPay(float hourPay) {
			this.hourPay = hourPay;
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

		@Override
		public String toString() {
			return "EmployeePayStandard [employeeGrade=" + employeeGrade + ", basicPay=" + basicPay + ", taxPercantage="
					+ taxPercantage + ", pfPercentage=" + pfPercentage + ", hourPay=" + hourPay + ", overtimePay="
					+ overtimePay + ", allowances=" + allowances + "]";
		}
		
		
		
		
		
}
