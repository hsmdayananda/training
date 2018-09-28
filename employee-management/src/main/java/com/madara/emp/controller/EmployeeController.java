package com.madara.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.madara.emp.model.Employee;
import com.madara.emp.service.EmployeeServiceImpl;

@RestController
@RequestMapping(value="/ems")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@RequestMapping(value="/hello")
	@ResponseStatus(HttpStatus.OK)
	public String greeting() {
		return "Hello spring boot";
	}

	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int id) {
		
		
		return employeeServiceImpl.getEmployee(id);
		
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public List<Employee> getEmployee() {
		
		
		return employeeServiceImpl.fetchEmplyees();
		
	}
	
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public Employee saveEmploye(@RequestBody Employee employee) {
		return employeeServiceImpl.save(employee);
	}
	
	
	
}
