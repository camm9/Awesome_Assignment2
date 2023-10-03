package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_Awesome {
	
	public Controller_Awesome() {
		
	}
	
	@GetMapping("/")
	public String renderHome() {
		return "home";
	}
	
	
	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {
			
		model.addAttribute("name", "Washington Valencia");
		model.addAttribute("bio", "Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");
		model.addAttribute("image", "assets/images/images/wva-06.jpg");
		model.addAttribute("rollName", "Dev/Ops");
		model.addAttribute("indeedUrl", "https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		model.addAttribute("githubUrl", "https://github.com/educristo777");
	
		return "wva-06";
	}
}
