package com.example.demios.implem;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demios.entity.Employee;
import com.example.demios.repository.EmpRepo;
import com.example.demios.service.EmpService;
@Service
public class EmpServiceimp implements EmpService{
	private EmpRepo empRepo;
	

	public EmpServiceimp(EmpRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public Employee addEmp(Employee employee) {
		Employee e1= empRepo.save(employee);
		return e1;
	}

	@Override
	public Employee updateEmp(Employee employee) {
		Employee e2=empRepo.findById(employee.getId()).get();
		e2.setName(employee.getName());
		e2.setCity(employee.getCity());
		e2.setSalary(employee.getSalary());
		Employee employee2=empRepo.save(e2);
		return employee2;
	}

	@Override
	public List<Employee> getemployee() {
		List<Employee> l1=empRepo.findAll();
		return l1;
	}

	@Override
	public void deleteEmp(Integer ID) {
		empRepo.deleteById(ID);
		
	}

}
