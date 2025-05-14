package com.example.demios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demios.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
