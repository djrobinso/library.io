package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entities.Patrons;
import com.example.demo.Repository.PatronRepository;

@Controller
public class PatronsController {
	
	@Autowired
	private PatronRepository patronRepository;
	
	@GetMapping("/Patron/AddPatron")
	public String addPatron(Model model) {
		Patrons newPatron = new Patrons();
		model.addAttribute("newPatron", newPatron);
		return "/Patron/AddPatron";
	}
	
	@PostMapping("")
	public String submitNewPatron(@ModelAttribute Patrons newPatron, Model model) {
		model.addAttribute("newPatron", newPatron);
		patronRepository.save(newPatron);
		return "/Patron/PatronAdded";
	}
	

}
