package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entities.Users;
import com.example.demo.Repository.UserRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	UserRepository employeeRepository;
	
	@GetMapping("/Users/AddEmployee")
	public String addEmployee(Model model) {
		Users newEmployee = new Users();
		var userRoles = employeeRepository.getUserRoles();
		model.addAttribute("newEmployee", newEmployee);
		model.addAttribute("userRoles", userRoles);
		return "/Users/AddEmployee";
	}
	
	@PostMapping("/Users/EmployeeAdded")
	public String submitNewEmployee(@ModelAttribute Users newEmployee, Model model) {
		model.addAttribute("newEmployee", newEmployee);
		employeeRepository.save(newEmployee);
		return "/Users/EmployeeAdded";
	}
}
