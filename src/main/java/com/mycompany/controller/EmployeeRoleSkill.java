package com.mycompany.controller;

public class EmployeeRoleSkill {

	private String empId;
	private String roleId;
	private String primarySkill;

	public EmployeeRoleSkill() {

	}

	public EmployeeRoleSkill(String empId, String role, String primarySkill) {
		super();
		this.empId = empId;
		this.roleId = role;
		this.primarySkill = primarySkill;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getRole() {
		return roleId;
	}

	public void setRole(String role) {
		this.roleId = role;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	
}
