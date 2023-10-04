package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_Awesome.TeamMember_awesome;

@Controller
public class Controller_Awesome {
	
	
	private TeamMember_awesome wva_06_object = new TeamMember_awesome();
	
	public Controller_Awesome() {
		
		wva_06_object.setIndeedUrl("https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		wva_06_object.setGithubUrl("https://github.com/educristo777");
		wva_06_object.setAge(38);
		wva_06_object.setRollName("Dev/Ops");
		wva_06_object.setName("Washington Valencia");
		wva_06_object.setImage("assets/images/images/wva-06.jpg");
		wva_06_object.setBio("Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");
		
	}
	
	@GetMapping("/")
	public String renderHome() {
		return "home";
	}
	
	
	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {
			
		model.addAttribute("wvaobj", wva_06_object);

		return "wva-06";
	}
}
