package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import csis3275.model_Awesome.Catherine_Awesome;
import csis3275.model_Awesome.Person;


@Controller
public class Controller_Awesome {
	Catherine_Awesome catherine = new Catherine_Awesome();
	Person test = new Person("bio", "image", "name", 19);
	public Controller_Awesome() {
		
		
	}
	
	@GetMapping("/")
	public String renderHome(Model model) {
		model.addAttribute("catherineAttribute", catherine);
//		model.addAttribute("personAttribute", test);
		return "home";
	}
	
	@GetMapping("/catherine")
	public String renderCatherine(Model model) {
		model.addAttribute("catherineAttribute", catherine);
//		model.addAttribute("personAttribute", test);
		return "catherineView";
	}
}
