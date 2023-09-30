package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_Awesome {
	
	public Controller_Awesome() {
		
	}
	
	@GetMapping("/")
	public String renderHome() {
		return "home";
	}
}
