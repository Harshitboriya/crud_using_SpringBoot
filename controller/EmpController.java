package com.crud.restapi.s.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.restapi.s.model.Employee;
import com.crud.restapi.s.repository.EmployeeRepo;

@RestController
public class EmpController {
	@Autowired
	private EmployeeRepo emprepo;

	@GetMapping("/api/getall")
	public List<Employee> getallemp() {
		return emprepo.findAll();
	}

//	build api to store 
	@PostMapping("/api/insert")
	public Employee insert(@RequestBody Employee emp) {
		return emprepo.save(emp);
	}
//	get employee by id rest api
	@GetMapping("/api/{id}")
	public Employee getbyid(@PathVariable int id) {
		Optional<Employee> em = emprepo.findById(id);
		return em.orElse(null);
	}
//	update by id rest api
	@PutMapping("/api/up/{id}")
	public Employee updateById(@PathVariable int id, @RequestBody Employee emp) {
		Optional<Employee> optionalEmployee = emprepo.findById(id);

		if (optionalEmployee.isPresent()) {
			Employee existingEmployee = optionalEmployee.get();
			existingEmployee.setName(emp.getName());
			existingEmployee.setEmail(emp.getEmail());
			return emprepo.save(existingEmployee);
		} else {
			return null; // Or you can return ResponseEntity with appropriate status code
		}
	}
//	delete by id rest api
	@DeleteMapping("/api/delete/{id}")
	public Employee deleteById(@PathVariable int id) {
		Optional<Employee> optionalEmployee = emprepo.findById(id);

		if (optionalEmployee.isPresent()) {
			Employee employeeToDelete = optionalEmployee.get();
			emprepo.delete(employeeToDelete);
			return employeeToDelete;
		} else {
			return null; // Or you can return ResponseEntity with appropriate status code
		}
	}
}
