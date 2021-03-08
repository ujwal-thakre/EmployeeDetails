package com.mycompany.entity;

public class EmployeeDetails {

	private String empId;
	private String role;
	private String primarySkill;

	public EmployeeDetails(String empId, String role, String primarySkill) {
		super();
		this.empId = empId;
		this.role = role;
		this.primarySkill = primarySkill;
	}

	public EmployeeDetails() {

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
}
