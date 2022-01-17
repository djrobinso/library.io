package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repository.UserRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	UserRepository employeeRepository;
	
	@RequestMapping("/Employee/AddEmployee")
	public String addEmployee() {
		return "Employee/AddEmployee";
	}
	

}
