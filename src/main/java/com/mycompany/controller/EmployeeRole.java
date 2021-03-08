package com.mycompany.controller;

public class EmployeeRole {

	private String roleId;
	private String roleDescription;
	public EmployeeRole() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeRole(String roleId, String roleDescription) {
		super();
		this.roleId = roleId;
		this.roleDescription = roleDescription;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
}
