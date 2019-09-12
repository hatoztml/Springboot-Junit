package com.proje.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proje.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setName("Hatoztml");
		emp.setDesignation("Software Engineer");
		emp.setSalary(5000);

		return emp;
	}

}
