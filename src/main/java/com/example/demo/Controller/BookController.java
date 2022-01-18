package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entities.Book;
import com.example.demo.Repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping("/Book/CheckIn")
	public String checkInBook (){
		return "book/CheckIn";
	}
	
	@RequestMapping("/Book/CheckOut")
	public String checkOutBook () {
		return "book/CheckOut";
	}
	
	@GetMapping("/Book/AddBook")
	public String addBook(Model model){
		Book newBook = new Book();
		model.addAttribute("newBook",newBook);
		return "book/AddBook";
	}
	
	@PostMapping("/Book/BookAdded")
	public String submitNewBook(@ModelAttribute Book newBook, Model model) {
		model.addAttribute("newBook", newBook );
		bookRepository.save(newBook);
		return "book/BookAdded";
	}
	
}
