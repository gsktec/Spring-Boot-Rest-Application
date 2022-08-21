package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EmloyeeRepository;
import com.example.demo.entity.Employee;

@RestController

@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmloyeeRepository empRepo;
	
	@GetMapping
	public String Start() {
		return "Working good";
	}
	
	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee ) {
		
		return empRepo.save(employee);
		
	}
	
	@GetMapping("/list")
	public List<Employee> getAllEmp( ) {
		
		return empRepo.findAll();
		
	}
	
	@PutMapping
	public Employee updateEmp(@RequestBody Employee employee ) {
		
		return empRepo.save(employee);
		
	}
	
	@DeleteMapping
	public String deleteEmp(@RequestParam Integer empID) {
		
		 empRepo.deleteById(empID);
		 return "Deleted Successfully";
	}

}
