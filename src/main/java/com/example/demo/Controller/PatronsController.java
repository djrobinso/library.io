package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repository.PatronRepository;

@Controller
public class PatronsController {
	
	@Autowired
	private PatronRepository patronRepository;
	
	@RequestMapping("/Patron/AddPatron")
	public String addPatron() {
		return "/Patron/AddPatron";
	}

}
