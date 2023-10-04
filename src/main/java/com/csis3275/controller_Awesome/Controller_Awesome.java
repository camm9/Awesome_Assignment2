package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import csis3275.model_Awesome.Person;


@Controller
public class Controller_Awesome {
	String bio = "My name is Catherine and I am a Cybersecurity student at Douglas College in New Westminister, BC. ";
	Person catherine = new Person(bio, "/Awesome_Assignment2/src/main/resources/static/catherine_selfie.jpg", "Catherine Methven", 29);
	public Controller_Awesome() {
		
		
	}
	
	@GetMapping("/")
	public String renderHome(Model model) {
		model.addAttribute("catherineAttribute", catherine);
		return "home";
	}
	
	@GetMapping("/catherine")
	public String renderCatherine(Model model) {
		model.addAttribute("catherineAttribute", catherine);
		return "catherineView";
	}
}
