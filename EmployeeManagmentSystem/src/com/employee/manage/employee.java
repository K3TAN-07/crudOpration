package com.employee.manage;

public class employee {

	private int employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeeCity;
	

	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeePhone() {
		return employeePhone;
	}


	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}


	public String getEmployeeCity() {
		return employeeCity;
	}


	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	
	
	public employee(int employeeId, String employeeName, String employeePhone, String employeeCity) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeCity = employeeCity;
	}


	public employee(String employeeName, String employeePhone, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeCity = employeeCity;
	}


	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeCity=" + employeeCity + "]";
	}


	
	
}
