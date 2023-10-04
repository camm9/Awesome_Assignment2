package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import csis3275.model_Awesome.Person;
import csis3275.model_Awesome.Student_wva_06;

@Controller
public class Controller_Awesome {
	private Student_wva_06 wva_06_object = new Student_wva_06();
	private Student_wva_06 catherine = new Student_wva_06();
//	private Student_wva_06 catherine = new Student_wva_06("Cybersecurity student at Douglas College in New Westminister, BC.", "assets/images/images/catherine_selfie.jpg", "Catherine Methven", 29, "Dev/Security Analyst", "https://www.linkedin.com/in/cathmethven/", "https://github.com/camm9");
//	public Student_wva_06(String bio, String image, String name, int age, String rollName,  String indeedUrl, String githubUrl)
	public Controller_Awesome() {
		
		wva_06_object.setIndeedUrl("https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		wva_06_object.setGithubUrl("https://github.com/educristo777");
		wva_06_object.setAge(38);
		wva_06_object.setRollName("Dev/Ops");
		wva_06_object.setName("Washington Valencia");
		wva_06_object.setImage("assets/images/images/wva-06.jpg");
		wva_06_object.setBio("Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");	
	
		catherine.setIndeedUrl("https://www.linkedin.com/in/cathmethven/");
		catherine.setGithubUrl("https://github.com/camm9");
		catherine.setAge(29);
		catherine.setRollName("Dev/Security Analyst");
		catherine.setName("Catherine Methven");
		catherine.setImage("assets/images/images/catherine_selfie.jpg");
		catherine.setBio("Cybersecurity student at Douglas College, New Westminster, BC");	
	
	}
	
	@GetMapping("/")
	public String renderHome(Model model) {
		return "home";
	}
	
	@GetMapping("/catherine")
	public String renderCatherine(Model model) {
		model.addAttribute("catherineAttribute", catherine);
		return "catherineView";
}

	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {
		model.addAttribute("wvaobj", wva_06_object);
		return "wva-06";
	}
}
