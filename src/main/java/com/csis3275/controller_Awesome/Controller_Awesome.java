package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import csis3275.model_Awesome.Person;
import csis3275.model_Awesome.Student_wva_06;

@Controller
public class Controller_Awesome {
	private Student_wva_06 wva_06_object = new Student_wva_06();
	
	public Controller_Awesome() {
		
		wva_06_object.setIndeedUrl("https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		wva_06_object.setGithubUrl("https://github.com/educristo777");
		wva_06_object.setAge(38);
		wva_06_object.setRollName("Dev/Ops");
		wva_06_object.setName("Washington Valencia");
		wva_06_object.setImage("assets/images/images/wva-06.jpg");
		wva_06_object.setBio("Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");	
	}
	
//	@GetMapping("/")
//	public String renderHome(Model model) {
//		model.addAttribute("catherineAttribute", catherine);
//		return "home";
//	}
	
//	@GetMapping("/catherine")
//	public String renderCatherine(Model model) {
//		model.addAttribute("catherineAttribute", catherine);
//		return "catherineView";
//}

	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {
		model.addAttribute("wvaobj", wva_06_object);
		return "wva-06";
	}
}
