package com.crud.restapi.s.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.restapi.s.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

//	all crud operations
}
