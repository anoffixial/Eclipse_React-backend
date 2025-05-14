package com.example.demios.service;

import java.util.List;

import com.example.demios.entity.Employee;

public interface EmpService {
	Employee addEmp(Employee employee);

	Employee updateEmp(Employee employee);

	List<Employee> getemployee();

	void deleteEmp(Integer ID);

}
