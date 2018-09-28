package com.madara.emp.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.madara.emp.model.Employee;

public interface EmployeeRepository extends Repository<Employee, Integer>{
	
	Employee save(Employee employee);
	Employee findById(Integer id);
	List<Employee> findAll();

}
