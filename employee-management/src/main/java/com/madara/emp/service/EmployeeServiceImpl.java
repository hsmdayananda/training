package com.madara.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madara.emp.model.Employee;
import com.madara.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {

		if (employee.getName().length() > 2) {

			return employeeRepository.save(employee);

		} else {
			throw new RuntimeException("Invalid employee name");
		}
	}
	
	public Employee getEmployee(int id) {
		
		return employeeRepository.findById(id);
	}
	
	public List<Employee> fetchEmplyees(){
		
		return employeeRepository.findAll();
	}
}
