package com.example.demios.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demios.entity.Employee;
import com.example.demios.implem.EmpServiceimp;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("Employee")
public class EmpController {
	private EmpServiceimp empServiceimp;

	public EmpController(EmpServiceimp empServiceimp) {
		super();
		this.empServiceimp = empServiceimp;
	}
	
	@PostMapping
	public ResponseEntity<Employee> addEntity(@RequestBody Employee employee){
		Employee e1=empServiceimp.addEmp(employee);
		return new ResponseEntity<Employee>(e1,HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEntity(){
		List<Employee> l1=empServiceimp.getemployee();
		return new ResponseEntity<List<Employee>>(l1,HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEntity(@PathVariable Integer id, @RequestBody Employee employee){
		Employee e1=empServiceimp.updateEmp(employee);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletedata(@PathVariable Integer id) {
		empServiceimp.deleteEmp(id);
	}
}
