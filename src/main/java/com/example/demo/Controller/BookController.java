package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/Book")
public class BookController {
	
	@GetMapping("/CheckIn")
	public String checkInBook (){
		return "Trying to check in a Book huh";
		
	}
	
}
