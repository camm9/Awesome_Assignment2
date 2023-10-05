package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.csis3275.model_Awesome.TeamMember_awesome;

@Controller
public class Controller_Awesome {

	private TeamMember_awesome wva_06_object = new TeamMember_awesome();
	private TeamMember_awesome ech_72_object = new TeamMember_awesome();
	private TeamMember_awesome cme_00_object = new TeamMember_awesome();
	private TeamMember_awesome jsh_35_object = new TeamMember_awesome();

	public Controller_Awesome() {

		wva_06_object.setLinkedinUrl("https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		wva_06_object.setGithubUrl("https://github.com/educristo777");
		wva_06_object.setAge(38);
		wva_06_object.setRoleName("Dev/Ops");
		wva_06_object.setName("Washington Valencia");
		wva_06_object.setImage("assets/images/images/wva-06.jpg");
		wva_06_object.setBio(
				"Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");
		InstantiateEdiObject();
		InstantiateCatherineObject();
	}

	private void InstantiateEdiObject() // move Edison instantiation down for better code readability
	{
		ech_72_object.setLinkedinUrl("https://www.linkedin.com/in/wai-cheung-chan-441687b0");
		ech_72_object.setGithubUrl("https://github.com/WCEdison");
		ech_72_object.setAge(28);
		ech_72_object.setRoleName("Lead/Dev/Ops");
		ech_72_object.setName("Edison CHAN");
		ech_72_object.setImage("assets/images/images/ech-72.jpg");
		ech_72_object.setBio(
				"A energetic and socialable programmer and entrepreneur. Co-founder and former chief engineer of Ed-Tech Startup Dot Dot Fire Limited. Welcome challenges or failings as long as he can fail forward.");

	}
	
	private void InstantiateCatherineObject() {
		
		cme_00_object.setLinkedinUrl("https://www.linkedin.com/in/cathmethven");
		cme_00_object.setGithubUrl("https://github.com/camm9");
		cme_00_object.setAge(28);
		cme_00_object.setRoleName("Dev/Security Analyst");
		cme_00_object.setName("Catherine Methven");
		cme_00_object.setImage("assets/images/images/catherine_selfie.jpg");
		cme_00_object.setBio(
				"Cybersecurity student at Douglas College in New Westminister, BC. Always curious and eager to learn new skills.");

		
	}
	
	private void InstantiateJaiminObject()  
	{
		jsh_35_object.setLinkedinUrl("https://www.linkedin.com/in/jaiminshah2\r\n"
				+ "\r\n"
				+ "");
		jsh_35_object.setGithubUrl("https://https://github.com/jaik27");
		jsh_35_object.setAge(26);
		jsh_35_object.setRoleName("DB Manager/Dev");
		jsh_35_object.setName("Jaimin Shah");
		jsh_35_object.setImage("assets/images/images/jsh-35.jpeg");
		jsh_35_object.setBio(
				"Aerospace Engineer");

	}

	@GetMapping("/")
	public String renderHome(Model model) {
		model.addAttribute("wvaobj", wva_06_object);
		model.addAttribute("echobj", ech_72_object);
		model.addAttribute("cmeobj", cme_00_object);
		model.addAttribute("jshobj", jsh_35_object);
		return "home";
	}
	
	@GetMapping("/catherine")
	public String renderCatherine(Model model) {
		model.addAttribute("cmeobj", cme_00_object);
		return "catherineView";
}


	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {

		model.addAttribute("wvaobj", wva_06_object);

		return "wva-06";
	}
	
	@GetMapping("/jsh-35")
	public String renderProfilePage(Model model) {

		model.addAttribute("jshobj", jsh_35_object);

		return "jsh-35";
	}

	@GetMapping("/ech-72")
	public String renderEdiProfilePage(Model model) {
		model.addAttribute("echobj", ech_72_object);
		return "ech-72";
	}

}
