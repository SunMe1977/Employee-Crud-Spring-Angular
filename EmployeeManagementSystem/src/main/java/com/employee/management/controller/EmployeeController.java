package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.repositories.EmployeeRepository;
import com.employee.management.entities.Employee;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("/employees") // http://localhost:8080/employees
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
