package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mycompany.entity.EmployeeDetails;

@RestController
public class EmployeeController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/employee/{empId}")
	public EmployeeDetails getEmployeeDetails(@PathVariable String empId) {

		// RestTemplate restTemplate = new RestTemplate();

		// Getting other project called...
		/*
		 * EmployeeRoleSkill employeeRoleSkill = restTemplate
		 * .getForObject("http://localhost:8092/EmployeeRoleSkill" + empId,
		 * EmployeeRoleSkill.class);
		 */

		//EMPLOYEE-ROLE-SERVICE: Logical Name
		EmployeeRoleSkill employeeRoleSkill = restTemplate
				.getForObject("http://EMPLOYEE-ROLE-SERVICE/EmployeeRoleSkill" + empId, EmployeeRoleSkill.class);

		// Step1> Call EmpRoleSkill
		EmployeeRole employeeRole = restTemplate.getForObject(
				"http://localhost:8091/EmployeeRoleDesc" + employeeRoleSkill.getRole(), EmployeeRole.class);

		// Step2. Call Role Description
		// Step3. Create or from EmployeeDetails and return
		return new EmployeeDetails(empId, employeeRole.getRoleDescription(), employeeRoleSkill.getPrimarySkill());
	}
}
